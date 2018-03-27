package com.dsh.latte.ec.base;

import android.os.Environment;

public class Constants {
	//���ſͷ��˺�
	public static final String ToChatUserName = "kefuchannelimid_671131";

	public static final String DESCRIPTOR = "com.umeng.share";//���˷���
	public static final String ALI_UP_URL = "http://img.mydubang.com/";
	//�汾���½ӿ�
	public static final String Action_GetVersion = "version/getVersionByClientCode";
	//��ȡ�Ƽ�λ
	public static final String Action_GetRecommend = "banner/getRecommendList";
	public static final String Action_GetCode = "user/sendCode";
	//ע��
	public static final String Action_Register = "user/register";
	//��¼
	public static final String Action_Login = "user/login";
	//��ȡ�û�������Ϣ
	public static final String Action_getUserLoginMsg = "user/getUserLoginMsg";
	//��������
	public static final String Action_ResetPsd = "user/forgetPassword";
	//��ȡ��ǰ����������������ŵ���ŵ���Ӷ��
	public static final String Action_appGetTaskStoreWithCityName = "task/appGetTaskStoreWithCityName";
	//��ȡ�����ŵ�������Ӷ��
	public static final String Action_appGetNearestTaskStore = "store/getNearestStoreAmountByScity";
	//��ȡĳ��������
	public static final String Action_appGetTaskStoreWithCityNameAndDistrict = "task/appGetTaskStoreWithCityNameAndDistrict";
	//��ȡ���и�����������Ӷ��
	public static final String Action_appGetTaskStoreCityPartition = "task/appGetTaskStoreCityPartition";
	//�����ŵ��Ż�ȡ���ŵ������е�����
	public static final String Action_appGetALLTaskWithStoreID = "task/getStateOneTaskByStid";
	//2.12.	�㲥�ӿ�
	public static final String Action_appGetAllRadioBroadcast = "radioBroadcast/appGetAllRadioBroadcast";
	//2.13.	��ӿ�
//	public static final String Action_appGetAllActivity = "activity/getStateZeroActivityByCity";
	public static final String Action_appGetAllActivity = "activity/getAllActivityByCity";
	//2.13.	��ȡϵͳ�㲥
	public static final String Action_applistBroadCast = "user/getSystemMsg";
	//��ѯ�û���ǰ�Ķ���
	public static final String Action_appListTaskOrder="taskorder/getUserTaskOrderByState";
	//����/�Ƕ�������
	public static final String Action_appListWorkOrder="workOrder/listWorkOrder";
	//������������
	public static final String Action_getWorkorderInfo_dd = "workOrder/getWorkorderInfo";
	public static final String Action_getWorkorderInfo_fdd = "workOrder/getCityTaskInfo";
	//�û�����
	public static final String Action_appAddTaskOrder="taskorder/addTaskOrder";
	//�Ƕ�����������
	public static final String Action_appAddFDDTaskOrder="taskorder/addUnPointTaskOrder";
	//��ӹ�ע����
	public static final String Action_appAddUserAttention="userattention/userAddAttention";
	//ȡ���ŵ��ע
	public static final String Action_appUserDelUserAttention="userattention/userCancelAttention";
	//ȡ�����̹�ע
	public static final String Action_appDelUserAttention="userAttention/appDelUserAttention";
	//��ȡ���̹�ע�б�
	public static final String Action_appGetAllUserAttention="userattention/getAttentionMessageByUid";
	//��ѯ���п�֧�����˻�
	public static final String Action_appUserGetBankCard="bankcard/listBankCardByUid";
	//���֤ʵ����֤
	public static final String Action_addIdentity="identity/addIdentity";
	//ɾ���û��˻�
	public static final String Action_appDelBankCard="bankcard/delBankCard";
	//������п�����֧�����˻�
	public static final String Action_appAddBankCard="bankcard/addBankCard";
	//�޸��û���Ϣ
	public static final String Action_appAlterUser="user/updateUser";
	//�޸�����
	public static final String Action_appAlterPassword="user/alterPassword";
	//�û�����
	public static final String Action_appAddWithDraw="withDraw/appAddWithDraw";
	//�û�����
	public static final String Action_appAddLeaveMessage="leaveMessage/addLeaveMessage";
	//����
	public static final String Action_appGetAllSearchStore="store/appGetAllSearchStore";
	//��������¼���ֻ�����
	public static final String Action_appBindingAccount="thirdpartyLogin/bindAccount";
	//��������¼ʱ����û��Ƿ�ע��
	public static final String Action_appCheckUserExit = "user/getUserByUserPhone";
	//��������¼
	public static final String Action_thirdPartyLogin="thirdpartyLogin/login";
	//��ȡ����ϸ�б�
	public static final String Action_appGetUserAllParticular="particular/getParticularByUid";
	//����ͳ�����
	public static final String Action_getParticularAccount="particular/getParticularAccount";
	//��ȡ��ѯ���
	public static final String Action_getWithDrawByUidWithQuery="withDraw/getWithDrawByUidWithQuery";
	//�ύ���񼰷���
	public static final String Action_appAddTaskFeedBack="taskFeedback/addTaskFeedback";
	//�޸����񼰷���
	public static final String Action_appUpdateTaskFeedBack="taskFeedback/updateTaskFeedBack";
	//��ȡ�û����
	public static final String Action_appGetMoney="user/getUserMoneys";
	//��������
	public static final String Action_appGetUserAllRemind="taskorder/getTaskOrderByUid";
	//�������Ƿ��ע
	public static final String Action_appCheckUserAttention="userAttention/appCheckUserAttention";
	//������������
	public static final String Action_appResetBankPassword="user/resetBankPassword";
	//ȡ������
	public static final String Action_appDelTaskOrder="taskorder/cancelTaskOrder";
	//����Ƿ�������������
	public static final String Action_appCheckUserBankPassWord="user/checkBankPassword";
	//һ����ȫ������
	public static final String Action_appAddTaskOrderWithStid="taskorder/addTaskFeedbackByStid";
	//��ȡ���õȼ�
	public static final String Action_appGetRate="integral/getIntegralByUid";
	//�ģ�巴��
	public static final String Action_appAddTempTask="template/listTemplate";
	public static final String Action_appUpdateTempTask="template/ updateTemplate";
	//��ȡ�����б�
	public static final String Action_appGetIntegralByUid = "integral/getIntegralByUid";
	//��ȡ��ҳ���������������Ϣ
	public static final String Action_appGetTask = "task/getTaskInfo";
	//��ȡ�ҵ�������Ϣ
	public static final String Action_appGetTaskDetail = "task/getUserTaskInfoByTid";
	public static final String Action_appGetTaskDetailByOid = "task/getUserTaskInfoByOid";
	//��ȡ������δ����Ϣ����
	public static final String Action_getUserMessageCount="usermessage/getUserMessageCountByUid";
	//��ȡ�û���Ϣ������
	public static final String Action_getUserByUid="user/getUserByUid";
	//���֤����ʵ����֤
	public static final String Action_certification = "user/certification";
	//��ȡ�̳�
	public static final String Action_getAllCourse = "course/getAllCourse";
	//��ȡ������˻򲹳�ʧ�ܵ�ԭ��
	public static final String Action_getFailReason = "taskFeedback/getFailReason";
	//�������
	public static final String Action_getRedPackDetails = "user/getRedPackDetails";
	//���ת��
	public static final String Action_addRedPackToBalance = "user/addRedPackToBalance";
	//���̨����ʡ�ݺͳ�����Ϣ
	public static final String Action_updateUserProvinceCity = "user/updateUserProvinceCity";
	//����ɸѡ�ӿ�
	public static final String Action_ListTask = "task/listTask";
	//��ȡ���������б�
	public static final String Action_listTaskOrderDelay = "taskorder/listTaskOrderDelay";
	//�����û�ȡ������
	public static final String Action_batchCancelTaskOrder = "taskorder/batchCancelTaskOrder";
	//��������
	public static final String Action_delayTaskOrder = "taskorder/delayTaskOrder";
	//�û�δ����Ϣ����
	public static final String Action_getUserMessageCountByUid =
			"usermessage/getUserMessageCountByUid";

	public static final String BaseFilePath = Environment.getExternalStorageDirectory() + "/DHStore/";

	public static String BASE_IP = "http://47.93.89.164/xiangpai/app/"; //�°���Է�


}
