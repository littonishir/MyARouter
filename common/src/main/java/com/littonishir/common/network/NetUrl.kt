package com.littonishir.common.network

/**
 * 网络连接
 */
object NetUrl {
    /**
     * BASE_URL
     */

//    const val ENVIRONMENT = "online"//阿里云生产环境

//    const val BASE_URL = "http://192.168.0.38:9600/"//38测试环境
//    const val ENVIRONMENT = "test"//38测试环境

//    const val BASE_URL = "http://192.168.0.132:9600/"//132开发环境
//    const val ENVIRONMENT = "dev"//132开发环境


//    const val BASE_URL = "http://192.168.0.40:9500/"//40测试环境
//    const val ENVIRONMENT = "preonline"

    const val BASE_URL = "https://app.yueyagongyu.com/"//阿里云测试环境
    const val ENVIRONMENT = "testonline"


    const val IM = "192.168.0.132"

    const val APPGATEWAY = "api/v1/"//网关，下面的均是服务
    const val USERCENTER = APPGATEWAY + "uc/"
    const val IMAGE = APPGATEWAY + "image/"
    const val NEO = APPGATEWAY + "zt-erp-neo-$ENVIRONMENT/"
    const val MMT = APPGATEWAY + "zt-erp-mmt-$ENVIRONMENT/"
    const val BUILDING = APPGATEWAY + "zt-building-dict-$ENVIRONMENT/"

    /**
     * 令牌管理经纪人
     */
    const val BROKERTOKEN = USERCENTER + "jwt/broker/token"

    /**
     * 令牌管理 客户端
     */
    const val CUSTOMERTOKEN = USERCENTER + "jwt/customer/token"

    /**
     * 客户端 登陆
     */
    const val CUSTOMERRUSERINFO = USERCENTER + "appCustomer/info"

    /**
     * 经纪人 登陆
     */
    const val BROKERUSERINFO = USERCENTER + "user/info"

    /**
     * 获取手机验证码
     */
    const val SENDPHONECODEBROKER = USERCENTER + "sms/sendPhoneCode"

    /**
     * 验证手机验证码
     */
    const val VERIFYPHONECODE = USERCENTER + "sms/verifyPhoneCode"

    /**
     * 更新用户手机号
     */
    const val UPDATEPHONENUMBROKER = USERCENTER + "user/updatePhoneNum"

    /**
     * 更新用户密码
     */
    const val UPDATEPASSWORDBROKER = USERCENTER + "user/updatePassWord"

    /**
     * 更新用户密码
     */
    const val RESETPASSWORDPASSWORDBROKER = USERCENTER + "user/resetPassWord"

    /**
     * 通过登录名查询用户
     */
    const val GETSYSUSERBROKER = USERCENTER + "user/getSysUser"

    /**
     * 统一登出
     */
    const val LOGOUTRBROKER = USERCENTER + "user/logout"

    /**
     * 上传信息卡
     */
    const val UPLOADINFOCARD = USERCENTER + "user/uploadInfoCard"

    /**
     * 上传二维码
     */
    const val UPLOADQRCODEPHOTO = USERCENTER + "user/uploadQrcodePhoto"

    /**
     * 上传客户端头像
     */
    const val APPCUSTOMERUPLOADPHOTO = USERCENTER + "appCustomer/uploadPhoto"

    /**
     * 获取用户信息
     * 二维码 信息卡
     */
    const val GETEMPLOYEEROSTERINFOBYUSERID = USERCENTER + "user/queryUserQrPhoteAndInfoCard"


    /**
     * 获取用户信息
     * 二维码
     */
    const val USERCOSDDE = USERCENTER + "sysUserRole/saveUserRole"

    /**
     * 项目类型元数据
     */
    const val PROTYPETREE = NEO + "zt/neo/app/clientSide/common/proType/tree/2001/1/1002"

    /**
     * 我的房源
     */
    const val GETROOMLIST = NEO + "zt/neo/app/clientSide/my/getRoomList"

    /**
     * 4.2 在线报修
     */
    const val ONLINEREPAIR = NEO + "zt/neo/app/clientSide/my/onlineRepair"

    /**
     * 在线业主委托接口
     */
    const val ENTRUSTHOUSEADD = NEO + "zt/neo/app/clientSide/entrustHouse/add"

    /**
     * 游客
     * 在线业主委托接口
     */
    const val NOTLOGINENTRUSTHOUSEADD = NEO + "zt/neo/app/clientSide/notLogin/addEntrustHouse"

    /**
     * 保存图片
     */
    const val SAVEIMAGE = IMAGE +"saveImage"

    /**
     * 数据字典接口
     */
    const val TREEDATAMORETYPE = NEO + "zt/neo/common/sysDict/treeDataMoreType"

    /**
     * 区域商圈数据字典
     */
    const val APIGETAREAS = BUILDING +"dict/open-api/getAreas"

    /**
     * 代理房列表
     * 代理房详情
     */
    const val LISTPAGE = MMT + "app/broker/house/listPage"
    const val LISTPAGEDETAIL = MMT + "app/broker/house/detail"

    /**
     * 业主直租列表
     * 业主直租详情
     */
    const val RENTALOWNERHOUSELISTPAGE = MMT + "app/broker/rentalOwnerHouse/listPage"
    const val RENTALOWNERHOUSELISTPAGEDETAIL = MMT + "app/broker/rentalOwnerHouse/detail"

    /**
     * 业主直租列表
     * 业主直租详情
     */
    const val BIZOWNERHOUSELISTPAGE = MMT + "app/broker/bizOwnerHouse/listPage"
    const val BIZOWNERHOUSELISTPAGEDETAIL = MMT + "app/broker/bizOwnerHouse/detail"

    /**
     * 租赁客户列表
     * 租赁客户详情
     */
    const val RENTBUSINESSOPPOLIST = NEO + "zt/neo/app/broker/rentBusinessOppo/list"
    const val RENTDEALBIZOPPODETAIL = NEO + "zt/neo/app/broker/rentBusinessOppo/info"

    /**
     * 买卖客户列表
     * 买卖客户详情
     */
    const val RENTDEALBIZOPPOLIST = NEO + "zt/neo/app/broker/rentDealBizoppo/list"
    const val RENTBUSINESSOPPODETAIL = NEO + "zt/neo/app/broker/rentDealBizoppo/detail"

    //跟进记录
    const val BUSINESSOPPOFOLLOWLIST = NEO + "zt/neo/app/broker/rentBusinessOppo/businessOppoFollowList"
    const val BUSINOKBYSTATE = NEO + "zt/neo/app/broker/rentBusinessOppo/findLookByState"//带看记录租赁


    //数据字典
    const val COMMONSELECTCOMMONSELECT = NEO + "zt/neo/common/commonSelect/getSelectData"

    //数据字典
    const val SYSDICTMORETYPE = NEO + "zt/neo/common/sysDict/moreType"

    /**
     * 应收列表和详情的接口文档
     */
    const val RCBILLLIST = NEO + "zt/neo/app/broker/finance/rcbill/list"
    const val RCBILLINFO = NEO + "zt/neo/app/broker/finance/rcbill/info"
    const val INCEXPRECEIVEINFO = NEO + "zt/neo/app/broker/finance/incexp/receiveInfo"

    /**
     *扫码接口
     */
    const val FXSCANPAY = NEO + "zt/neo/pc/fx/scanPay"
    const val FXSCANPAYQUERY = NEO + "zt/neo/pc/fx/tradeQuery"






}


