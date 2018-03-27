package com.dsh.latte.ec.base;

import android.os.Environment;

public class Constants {
	//环信客服账号
	public static final String ToChatUserName = "kefuchannelimid_671131";

	public static final String DESCRIPTOR = "com.umeng.share";//友盟分享
	public static final String ALI_UP_URL = "http://img.mydubang.com/";
	//版本更新接口
	public static final String Action_GetVersion = "version/getVersionByClientCode";
	//获取推荐位
	public static final String Action_GetRecommend = "banner/getRecommendList";
	public static final String Action_GetCode = "user/sendCode";
	//注册
	public static final String Action_Register = "user/register";
	//登录
	public static final String Action_Login = "user/login";
	//获取用户个人信息
	public static final String Action_getUserLoginMsg = "user/getUserLoginMsg";
	//忘记密码
	public static final String Action_ResetPsd = "user/forgetPassword";
	//获取当前城市所有有任务的门店和门店总佣金
	public static final String Action_appGetTaskStoreWithCityName = "task/appGetTaskStoreWithCityName";
	//获取附近门店的任务和佣金
	public static final String Action_appGetNearestTaskStore = "store/getNearestStoreAmountByScity";
	//获取某区的任务
	public static final String Action_appGetTaskStoreWithCityNameAndDistrict = "task/appGetTaskStoreWithCityNameAndDistrict";
	//获取城市各个区的任务佣金
	public static final String Action_appGetTaskStoreCityPartition = "task/appGetTaskStoreCityPartition";
	//根据门店编号获取此门店中所有的任务
	public static final String Action_appGetALLTaskWithStoreID = "task/getStateOneTaskByStid";
	//2.12.	广播接口
	public static final String Action_appGetAllRadioBroadcast = "radioBroadcast/appGetAllRadioBroadcast";
	//2.13.	活动接口
//	public static final String Action_appGetAllActivity = "activity/getStateZeroActivityByCity";
	public static final String Action_appGetAllActivity = "activity/getAllActivityByCity";
	//2.13.	获取系统广播
	public static final String Action_applistBroadCast = "user/getSystemMsg";
	//查询用户当前的订单
	public static final String Action_appListTaskOrder="taskorder/getUserTaskOrderByState";
	//定点/非定点任务
	public static final String Action_appListWorkOrder="workOrder/listWorkOrder";
	//定点任务详情
	public static final String Action_getWorkorderInfo_dd = "workOrder/getWorkorderInfo";
	public static final String Action_getWorkorderInfo_fdd = "workOrder/getCityTaskInfo";
	//用户抢单
	public static final String Action_appAddTaskOrder="taskorder/addTaskOrder";
	//非定点任务抢单
	public static final String Action_appAddFDDTaskOrder="taskorder/addUnPointTaskOrder";
	//添加关注店铺
	public static final String Action_appAddUserAttention="userattention/userAddAttention";
	//取消门店关注
	public static final String Action_appUserDelUserAttention="userattention/userCancelAttention";
	//取消店铺关注
	public static final String Action_appDelUserAttention="userAttention/appDelUserAttention";
	//获取店铺关注列表
	public static final String Action_appGetAllUserAttention="userattention/getAttentionMessageByUid";
	//查询银行卡支付宝账户
	public static final String Action_appUserGetBankCard="bankcard/listBankCardByUid";
	//身份证实名认证
	public static final String Action_addIdentity="identity/addIdentity";
	//删除用户账户
	public static final String Action_appDelBankCard="bankcard/delBankCard";
	//添加银行卡或者支付宝账户
	public static final String Action_appAddBankCard="bankcard/addBankCard";
	//修改用户信息
	public static final String Action_appAlterUser="user/updateUser";
	//修改密码
	public static final String Action_appAlterPassword="user/alterPassword";
	//用户提现
	public static final String Action_appAddWithDraw="withDraw/appAddWithDraw";
	//用户反馈
	public static final String Action_appAddLeaveMessage="leaveMessage/addLeaveMessage";
	//搜索
	public static final String Action_appGetAllSearchStore="store/appGetAllSearchStore";
	//第三方登录绑定手机号码
	public static final String Action_appBindingAccount="thirdpartyLogin/bindAccount";
	//第三方登录时检查用户是否注册
	public static final String Action_appCheckUserExit = "user/getUserByUserPhone";
	//第三方登录
	public static final String Action_thirdPartyLogin="thirdpartyLogin/login";
	//获取金额及明细列表
	public static final String Action_appGetUserAllParticular="particular/getParticularByUid";
	//收入统计情况
	public static final String Action_getParticularAccount="particular/getParticularAccount";
	//提取查询情况
	public static final String Action_getWithDrawByUidWithQuery="withDraw/getWithDrawByUidWithQuery";
	//提交任务及反馈
	public static final String Action_appAddTaskFeedBack="taskFeedback/addTaskFeedback";
	//修改任务及反馈
	public static final String Action_appUpdateTaskFeedBack="taskFeedback/updateTaskFeedBack";
	//获取用户金额
	public static final String Action_appGetMoney="user/getUserMoneys";
	//任务提醒
	public static final String Action_appGetUserAllRemind="taskorder/getTaskOrderByUid";
	//检查店铺是否关注
	public static final String Action_appCheckUserAttention="userAttention/appCheckUserAttention";
	//设置提现密码
	public static final String Action_appResetBankPassword="user/resetBankPassword";
	//取消订单
	public static final String Action_appDelTaskOrder="taskorder/cancelTaskOrder";
	//检查是否设置提现密码
	public static final String Action_appCheckUserBankPassWord="user/checkBankPassword";
	//一键抢全店任务
	public static final String Action_appAddTaskOrderWithStid="taskorder/addTaskFeedbackByStid";
	//获取信用等级
	public static final String Action_appGetRate="integral/getIntegralByUid";
	//活动模板反馈
	public static final String Action_appAddTempTask="template/listTemplate";
	public static final String Action_appUpdateTempTask="template/ updateTemplate";
	//获取积分列表
	public static final String Action_appGetIntegralByUid = "integral/getIntegralByUid";
	//获取首页任务待抢单任务信息
	public static final String Action_appGetTask = "task/getTaskInfo";
	//获取我的任务信息
	public static final String Action_appGetTaskDetail = "task/getUserTaskInfoByTid";
	public static final String Action_appGetTaskDetailByOid = "task/getUserTaskInfoByOid";
	//获取各类型未读消息数量
	public static final String Action_getUserMessageCount="usermessage/getUserMessageCountByUid";
	//获取用户信息及积分
	public static final String Action_getUserByUid="user/getUserByUid";
	//身份证号码实名认证
	public static final String Action_certification = "user/certification";
	//获取教程
	public static final String Action_getAllCourse = "course/getAllCourse";
	//获取任务审核或补充失败的原因
	public static final String Action_getFailReason = "taskFeedback/getFailReason";
	//红包详情
	public static final String Action_getRedPackDetails = "user/getRedPackDetails";
	//红包转存
	public static final String Action_addRedPackToBalance = "user/addRedPackToBalance";
	//向后台发送省份和城市信息
	public static final String Action_updateUserProvinceCity = "user/updateUserProvinceCity";
	//任务筛选接口
	public static final String Action_ListTask = "task/listTask";
	//获取临期任务列表
	public static final String Action_listTaskOrderDelay = "taskorder/listTaskOrderDelay";
	//批量用户取消订单
	public static final String Action_batchCancelTaskOrder = "taskorder/batchCancelTaskOrder";
	//批量延期
	public static final String Action_delayTaskOrder = "taskorder/delayTaskOrder";
	//用户未读消息数量
	public static final String Action_getUserMessageCountByUid =
			"usermessage/getUserMessageCountByUid";

	public static final String BaseFilePath = Environment.getExternalStorageDirectory() + "/DHStore/";

	public static String BASE_IP = "http://47.93.89.164/xiangpai/app/"; //新版测试服


}
