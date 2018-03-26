package com.dsh.latte.net.download;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

import com.dsh.latte.app.Latte;
import com.dsh.latte.net.callback.IRequest;
import com.dsh.latte.net.callback.ISuccess;
import com.dsh.latte.util.file.FileUtil;

import java.io.File;
import java.io.InputStream;

import okhttp3.ResponseBody;

/**
 * Created by Adam on 2018/3/26.
 */

public class SaveFileTask extends AsyncTask<Object,Void,File> {
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;

    SaveFileTask(IRequest REQUEST, ISuccess SUCCESS) {
        this.REQUEST = REQUEST;
        this.SUCCESS = SUCCESS;
    }

    @Override
    protected File doInBackground(Object... params) {
        String downloadDir = (String) params[0];
        String extension = (String) params[1];
        final ResponseBody body = (ResponseBody) params[2];
        final String name = (String) params[3];
        final InputStream is = body.byteStream();
        if (downloadDir == null || downloadDir.equals("")) {
            downloadDir = "down_loads";
        }
        if (extension == null || extension.equals("")) {
            extension = "";
        }
        if (name == null) {
            return FileUtil.writeToDisk(is, downloadDir, extension.toUpperCase(), extension);
        } else {
            return FileUtil.writeToDisk(is, downloadDir, name);
        }
    }

    @Override
    protected void onPostExecute(File file) {
        super.onPostExecute(file);
        if (SUCCESS !=null){
            SUCCESS.onSuccess(file.getPath());
        }
        if (REQUEST!=null){
            REQUEST.onRequestEnd();
        }
        autoInstallAPK(file);
    }

    private void autoInstallAPK(File file){
        if (FileUtil.getExtension(file.getPath()).equals("apk")){
            final Intent install = new Intent();
            install.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            install.setAction(Intent.ACTION_VIEW);
            install.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            Latte.getApplicationContext().startActivity(install);

        }
    }
}
