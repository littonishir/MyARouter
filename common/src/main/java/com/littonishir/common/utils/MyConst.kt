package com.littonishir.retrofitsample.utils

object MyConst {
    /**
     * Log Tag
     */
    const val TAG = "littonishir"
    /**
     * intent singleKey
     */
    const val SINGLEKEY = "singleKey"

    /**
     * 经纪人
     * token
     */
    const val TOKEN = "token"
    /**
     * 经纪人
     * session
     */
    const val SESSION = "session"


    /**
     * 客户端
     * token
     */
    const val TOKEN_CLIENT = "token_client"
    /**
     * 客户端
     * session
     */
    const val SESSION_CLIENT = "session_client"
    /**
     * clientType
     */
    const val CUSTOMER = "renter"//侯哥更换了标识
    const val BROKER = "broker"
    const val CLIENTTYPE = "clientType"


    //-----------------broker------------------^^^^^^^^


    /**
     * 保存用户账号密码
     */
    const val userAndPassword = "userAndPassword"

    /**
     * 电梯
     */
    const val elevator =  "{\"meta\":{\"code\":\"200\",\"message\":\"ok\"},\"data\":[{\"value\":1,\"label\":\"有\"},{\"value\":2,\"label\":\"无\"}]}"

    /**
     * CommonInfo data KEY
     */
    const val InfoKey = "InfoKey"
    /**
     * CommonInfo put
     */
    const val Info = "Info"

    /**
     * Parcelable 传递实体
     */
    const val entity = "entity"

    /**
     * 图片压缩缓存文件夹
     */
    const val IMAGE_LOCAL = "DCIM/broker"

    /**
     * 我的私客
     * 跳转TYPE
     */
    const val DINGJIN = "dingjin"
    const val QIANYUE = "qianyue"


    /**
     * 租客信息-requestCode
     */
    const val RENTER0 = 2700
    const val RENTER1 = 2701
    const val RENTER2 = 2702
    const val RENTER3 = 2703
    const val RENTER4 = 2704
    const val RENTER5 = 2705
    const val RENTER6 = 2706
    const val RENTER7 = 2707
    const val RENTER8 = 2708

    /**
     * 租客信息-data-key
     */
    const val RENTER_VALUE = "renter_value"

    /**
     * 居住人数
     */
    const val RENTCOUNT = "1、2、3、4、5、6、7、8、9、10"

    /**
     * 位置信息
     */
    const val area = "{\"data\":[{\"dictionaryId\":369,\"name\":\"北京\",\"rows\":[{\"dictionaryId\":370,\"name\":\"东城区\",\"rows\":[{\"dictionaryId\":371,\"name\":\"安定门\",\"value\":\"26\"},{\"dictionaryId\":372,\"name\":\"安贞\",\"value\":\"27\"},{\"dictionaryId\":373,\"name\":\"崇文门\",\"value\":\"28\"},{\"dictionaryId\":374,\"name\":\"朝阳门内\",\"value\":\"29\"},{\"dictionaryId\":375,\"name\":\"东花市\",\"value\":\"30\"},{\"dictionaryId\":376,\"name\":\"地安门\",\"value\":\"31\"},{\"dictionaryId\":377,\"name\":\"灯市口\",\"value\":\"32\"},{\"dictionaryId\":378,\"name\":\"东四\",\"value\":\"33\"},{\"dictionaryId\":379,\"name\":\"东单\",\"value\":\"34\"},{\"dictionaryId\":380,\"name\":\"东直门\",\"value\":\"35\"},{\"dictionaryId\":381,\"name\":\"广渠门\",\"value\":\"36\"},{\"dictionaryId\":382,\"name\":\"和平里\",\"value\":\"37\"},{\"dictionaryId\":383,\"name\":\"交道口\",\"value\":\"38\"},{\"dictionaryId\":384,\"name\":\"金宝街\",\"value\":\"39\"},{\"dictionaryId\":385,\"name\":\"建国门内\",\"value\":\"40\"},{\"dictionaryId\":386,\"name\":\"天坛\",\"value\":\"41\"},{\"dictionaryId\":387,\"name\":\"西罗园\",\"value\":\"42\"},{\"dictionaryId\":388,\"name\":\"永定门\",\"value\":\"43\"},{\"dictionaryId\":389,\"name\":\"左安门\",\"value\":\"44\"},{\"dictionaryId\":390,\"name\":\"北新桥\",\"value\":\"45\"},{\"dictionaryId\":391,\"name\":\"雍和宫\",\"value\":\"46\"}],\"value\":\"25\"},{\"dictionaryId\":392,\"name\":\"西城区\",\"rows\":[{\"dictionaryId\":393,\"name\":\"白纸坊\",\"value\":\"48\"},{\"dictionaryId\":394,\"name\":\"长椿街\",\"value\":\"49\"},{\"dictionaryId\":395,\"name\":\"车公庄\",\"value\":\"50\"},{\"dictionaryId\":396,\"name\":\"地安门\",\"value\":\"51\"},{\"dictionaryId\":397,\"name\":\"德胜门\",\"value\":\"52\"},{\"dictionaryId\":398,\"name\":\"阜成门\",\"value\":\"53\"},{\"dictionaryId\":399,\"name\":\"广安门\",\"value\":\"54\"},{\"dictionaryId\":400,\"name\":\"官园\",\"value\":\"55\"},{\"dictionaryId\":401,\"name\":\"金融街\",\"value\":\"56\"},{\"dictionaryId\":402,\"name\":\"六铺炕\",\"value\":\"57\"},{\"dictionaryId\":403,\"name\":\"马甸\",\"value\":\"58\"},{\"dictionaryId\":404,\"name\":\"马连道\",\"value\":\"59\"},{\"dictionaryId\":405,\"name\":\"木樨地\",\"value\":\"60\"},{\"dictionaryId\":406,\"name\":\"牛街\",\"value\":\"61\"},{\"dictionaryId\":407,\"name\":\"陶然亭\",\"value\":\"62\"},{\"dictionaryId\":408,\"name\":\"天宁寺\",\"value\":\"63\"},{\"dictionaryId\":409,\"name\":\"西四\",\"value\":\"64\"},{\"dictionaryId\":410,\"name\":\"宣武门\",\"value\":\"65\"},{\"dictionaryId\":411,\"name\":\"西直门\",\"value\":\"66\"},{\"dictionaryId\":412,\"name\":\"新街口\",\"value\":\"67\"},{\"dictionaryId\":413,\"name\":\"西单\",\"value\":\"68\"},{\"dictionaryId\":414,\"name\":\"月坛\",\"value\":\"69\"},{\"dictionaryId\":415,\"name\":\"右安门内\",\"value\":\"70\"},{\"dictionaryId\":416,\"name\":\"马甸(西城区)\",\"value\":\"71\"},{\"dictionaryId\":417,\"name\":\"前门\",\"value\":\"72\"}],\"value\":\"47\"},{\"dictionaryId\":418,\"name\":\"朝阳区\",\"rows\":[{\"dictionaryId\":419,\"name\":\"奥林匹克公园\",\"value\":\"74\"},{\"dictionaryId\":420,\"name\":\"安贞\",\"value\":\"75\"},{\"dictionaryId\":421,\"name\":\"北苑\",\"value\":\"76\"},{\"dictionaryId\":422,\"name\":\"北工大\",\"value\":\"77\"},{\"dictionaryId\":423,\"name\":\"百子湾\",\"value\":\"78\"},{\"dictionaryId\":424,\"name\":\"常营\",\"value\":\"79\"},{\"dictionaryId\":425,\"name\":\"成寿寺\",\"value\":\"80\"},{\"dictionaryId\":426,\"name\":\"朝阳门外\",\"value\":\"81\"},{\"dictionaryId\":427,\"name\":\"朝阳公园\",\"value\":\"82\"},{\"dictionaryId\":428,\"name\":\"朝青\",\"value\":\"83\"},{\"dictionaryId\":429,\"name\":\"CBD\",\"value\":\"84\"},{\"dictionaryId\":430,\"name\":\"大望路\",\"value\":\"85\"},{\"dictionaryId\":431,\"name\":\"定福庄\",\"value\":\"86\"},{\"dictionaryId\":432,\"name\":\"豆各庄\",\"value\":\"87\"},{\"dictionaryId\":433,\"name\":\"大山子\",\"value\":\"88\"},{\"dictionaryId\":434,\"name\":\"东大桥\",\"value\":\"89\"},{\"dictionaryId\":435,\"name\":\"东坝\",\"value\":\"90\"},{\"dictionaryId\":436,\"name\":\"垡头\",\"value\":\"91\"},{\"dictionaryId\":437,\"name\":\"广渠门\",\"value\":\"92\"},{\"dictionaryId\":438,\"name\":\"管庄\",\"value\":\"93\"},{\"dictionaryId\":439,\"name\":\"甘露园\",\"value\":\"94\"},{\"dictionaryId\":440,\"name\":\"高碑店\",\"value\":\"95\"},{\"dictionaryId\":441,\"name\":\"国展\",\"value\":\"96\"},{\"dictionaryId\":442,\"name\":\"工体\",\"value\":\"97\"},{\"dictionaryId\":443,\"name\":\"和平里\",\"value\":\"98\"},{\"dictionaryId\":444,\"name\":\"欢乐谷\",\"value\":\"99\"},{\"dictionaryId\":445,\"name\":\"惠新西街\",\"value\":\"100\"},{\"dictionaryId\":446,\"name\":\"华威桥\",\"value\":\"101\"},{\"dictionaryId\":447,\"name\":\"红庙\",\"value\":\"102\"},{\"dictionaryId\":448,\"name\":\"健翔桥\",\"value\":\"103\"},{\"dictionaryId\":449,\"name\":\"劲松\",\"value\":\"104\"},{\"dictionaryId\":450,\"name\":\"建国门外\",\"value\":\"105\"},{\"dictionaryId\":451,\"name\":\"酒仙桥\",\"value\":\"106\"},{\"dictionaryId\":452,\"name\":\"马甸\",\"value\":\"107\"},{\"dictionaryId\":453,\"name\":\"农展馆\",\"value\":\"108\"},{\"dictionaryId\":454,\"name\":\"南沙滩\",\"value\":\"109\"},{\"dictionaryId\":455,\"name\":\"潘家园\",\"value\":\"110\"},{\"dictionaryId\":456,\"name\":\"三里屯\",\"value\":\"111\"},{\"dictionaryId\":457,\"name\":\"四惠\",\"value\":\"112\"},{\"dictionaryId\":458,\"name\":\"双桥\",\"value\":\"113\"},{\"dictionaryId\":459,\"name\":\"十八里店\",\"value\":\"114\"},{\"dictionaryId\":460,\"name\":\"十里河\",\"value\":\"115\"},{\"dictionaryId\":461,\"name\":\"十里堡\",\"value\":\"116\"},{\"dictionaryId\":462,\"name\":\"石佛营\",\"value\":\"117\"},{\"dictionaryId\":463,\"name\":\"马甸(朝阳区)\",\"value\":\"118\"},{\"dictionaryId\":464,\"name\":\"来广营\",\"value\":\"119\"},{\"dictionaryId\":465,\"name\":\"呼家楼\",\"value\":\"120\"},{\"dictionaryId\":466,\"name\":\"芍药居\",\"value\":\"121\"},{\"dictionaryId\":467,\"name\":\"安定门\",\"value\":\"122\"},{\"dictionaryId\":468,\"name\":\"朝阳其它\",\"value\":\"123\"},{\"dictionaryId\":469,\"name\":\"东直门\",\"value\":\"124\"},{\"dictionaryId\":470,\"name\":\"双井\",\"value\":\"125\"},{\"dictionaryId\":471,\"name\":\"三元桥\",\"value\":\"126\"},{\"dictionaryId\":472,\"name\":\"太阳宫\",\"value\":\"127\"},{\"dictionaryId\":473,\"name\":\"团结湖\",\"value\":\"128\"},{\"dictionaryId\":474,\"name\":\"甜水园\",\"value\":\"129\"},{\"dictionaryId\":475,\"name\":\"望京\",\"value\":\"130\"},{\"dictionaryId\":476,\"name\":\"西坝河\",\"value\":\"131\"},{\"dictionaryId\":477,\"name\":\"燕莎\",\"value\":\"132\"},{\"dictionaryId\":478,\"name\":\"亚运村\",\"value\":\"133\"},{\"dictionaryId\":479,\"name\":\"亚运村小营\",\"value\":\"134\"}],\"value\":\"73\"},{\"dictionaryId\":480,\"name\":\"海淀区\",\"rows\":[{\"dictionaryId\":481,\"name\":\"安宁庄\",\"value\":\"136\"},{\"dictionaryId\":482,\"name\":\"白石桥\",\"value\":\"137\"},{\"dictionaryId\":483,\"name\":\"北太平庄\",\"value\":\"138\"},{\"dictionaryId\":484,\"name\":\"厂洼\",\"value\":\"139\"},{\"dictionaryId\":485,\"name\":\"二里庄\",\"value\":\"140\"},{\"dictionaryId\":486,\"name\":\"公主坟\",\"value\":\"141\"},{\"dictionaryId\":487,\"name\":\"甘家口\",\"value\":\"142\"},{\"dictionaryId\":488,\"name\":\"海淀其它\",\"value\":\"143\"},{\"dictionaryId\":489,\"name\":\"海淀北部新区\",\"value\":\"144\"},{\"dictionaryId\":490,\"name\":\"军博\",\"value\":\"145\"},{\"dictionaryId\":491,\"name\":\"马甸\",\"value\":\"146\"},{\"dictionaryId\":492,\"name\":\"牡丹园\",\"value\":\"147\"},{\"dictionaryId\":493,\"name\":\"马连洼\",\"value\":\"148\"},{\"dictionaryId\":494,\"name\":\"清河\",\"value\":\"149\"},{\"dictionaryId\":495,\"name\":\"苏州桥\",\"value\":\"150\"},{\"dictionaryId\":496,\"name\":\"世纪城\",\"value\":\"151\"},{\"dictionaryId\":497,\"name\":\"四季青\",\"value\":\"152\"},{\"dictionaryId\":498,\"name\":\"双榆树\",\"value\":\"153\"},{\"dictionaryId\":499,\"name\":\"上地\",\"value\":\"154\"},{\"dictionaryId\":500,\"name\":\"田村\",\"value\":\"155\"},{\"dictionaryId\":501,\"name\":\"万寿路\",\"value\":\"156\"},{\"dictionaryId\":502,\"name\":\"魏公村\",\"value\":\"157\"},{\"dictionaryId\":503,\"name\":\"五棵松\",\"value\":\"158\"},{\"dictionaryId\":504,\"name\":\"万柳\",\"value\":\"159\"},{\"dictionaryId\":505,\"name\":\"五道口\",\"value\":\"160\"},{\"dictionaryId\":506,\"name\":\"西北旺\",\"value\":\"161\"},{\"dictionaryId\":507,\"name\":\"小西天\",\"value\":\"162\"},{\"dictionaryId\":508,\"name\":\"新街口\",\"value\":\"163\"},{\"dictionaryId\":509,\"name\":\"西直门\",\"value\":\"164\"},{\"dictionaryId\":510,\"name\":\"西三旗\",\"value\":\"165\"},{\"dictionaryId\":511,\"name\":\"西山\",\"value\":\"166\"},{\"dictionaryId\":512,\"name\":\"学院路\",\"value\":\"167\"},{\"dictionaryId\":513,\"name\":\"西二旗\",\"value\":\"168\"},{\"dictionaryId\":514,\"name\":\"颐和园\",\"value\":\"169\"},{\"dictionaryId\":515,\"name\":\"玉泉路\",\"value\":\"170\"},{\"dictionaryId\":516,\"name\":\"杨庄\",\"value\":\"171\"},{\"dictionaryId\":517,\"name\":\"圆明园\",\"value\":\"172\"},{\"dictionaryId\":518,\"name\":\"皂君庙\",\"value\":\"173\"},{\"dictionaryId\":519,\"name\":\"紫竹桥\",\"value\":\"174\"},{\"dictionaryId\":520,\"name\":\"中关村\",\"value\":\"175\"},{\"dictionaryId\":521,\"name\":\"知春路\",\"value\":\"176\"},{\"dictionaryId\":522,\"name\":\"定慧寺\",\"value\":\"177\"},{\"dictionaryId\":523,\"name\":\"门头沟其它\",\"value\":\"178\"}],\"value\":\"135\"},{\"dictionaryId\":524,\"name\":\"丰台区\",\"rows\":[{\"dictionaryId\":525,\"name\":\"北京南站\",\"value\":\"180\"},{\"dictionaryId\":526,\"name\":\"北大地\",\"value\":\"181\"},{\"dictionaryId\":527,\"name\":\"成寿寺\",\"value\":\"182\"},{\"dictionaryId\":528,\"name\":\"草桥\",\"value\":\"183\"},{\"dictionaryId\":529,\"name\":\"菜户营\",\"value\":\"184\"},{\"dictionaryId\":530,\"name\":\"大红门\",\"value\":\"185\"},{\"dictionaryId\":531,\"name\":\"丰台其它\",\"value\":\"186\"},{\"dictionaryId\":532,\"name\":\"方庄\",\"value\":\"187\"},{\"dictionaryId\":533,\"name\":\"和义\",\"value\":\"188\"},{\"dictionaryId\":534,\"name\":\"花乡\",\"value\":\"189\"},{\"dictionaryId\":535,\"name\":\"角门\",\"value\":\"190\"},{\"dictionaryId\":536,\"name\":\"科技园区\",\"value\":\"191\"},{\"dictionaryId\":537,\"name\":\"看丹桥\",\"value\":\"192\"},{\"dictionaryId\":538,\"name\":\"六里桥\",\"value\":\"193\"},{\"dictionaryId\":539,\"name\":\"刘家窑\",\"value\":\"194\"},{\"dictionaryId\":540,\"name\":\"丽泽\",\"value\":\"195\"},{\"dictionaryId\":541,\"name\":\"卢沟桥\",\"value\":\"196\"},{\"dictionaryId\":542,\"name\":\"马家堡\",\"value\":\"197\"},{\"dictionaryId\":543,\"name\":\"木樨园\",\"value\":\"198\"},{\"dictionaryId\":544,\"name\":\"蒲黄榆\",\"value\":\"199\"},{\"dictionaryId\":545,\"name\":\"七里庄\",\"value\":\"200\"},{\"dictionaryId\":546,\"name\":\"青塔\",\"value\":\"201\"},{\"dictionaryId\":547,\"name\":\"宋家庄\",\"value\":\"202\"},{\"dictionaryId\":548,\"name\":\"太平桥\",\"value\":\"203\"},{\"dictionaryId\":549,\"name\":\"五里店\",\"value\":\"204\"},{\"dictionaryId\":550,\"name\":\"五棵松\",\"value\":\"205\"},{\"dictionaryId\":551,\"name\":\"西罗园\",\"value\":\"206\"},{\"dictionaryId\":552,\"name\":\"新宫\",\"value\":\"207\"},{\"dictionaryId\":553,\"name\":\"洋桥\",\"value\":\"208\"},{\"dictionaryId\":554,\"name\":\"玉泉营\",\"value\":\"209\"},{\"dictionaryId\":555,\"name\":\"岳各庄\",\"value\":\"210\"},{\"dictionaryId\":556,\"name\":\"赵公口\",\"value\":\"211\"}],\"value\":\"179\"},{\"dictionaryId\":557,\"name\":\"石景山区\",\"rows\":[{\"dictionaryId\":558,\"name\":\"八角\",\"value\":\"213\"},{\"dictionaryId\":559,\"name\":\"古城\",\"value\":\"214\"},{\"dictionaryId\":560,\"name\":\"鲁谷\",\"value\":\"215\"},{\"dictionaryId\":561,\"name\":\"老山\",\"value\":\"216\"},{\"dictionaryId\":562,\"name\":\"苹果园\",\"value\":\"217\"},{\"dictionaryId\":563,\"name\":\"玉泉路\",\"value\":\"218\"},{\"dictionaryId\":564,\"name\":\"杨庄\",\"value\":\"219\"},{\"dictionaryId\":565,\"name\":\"石景山玉泉路\",\"value\":\"220\"}],\"value\":\"212\"},{\"dictionaryId\":566,\"name\":\"通州区\",\"rows\":[{\"dictionaryId\":567,\"name\":\"北关\",\"value\":\"222\"},{\"dictionaryId\":568,\"name\":\"果园\",\"value\":\"223\"},{\"dictionaryId\":569,\"name\":\"九棵树(家乐福)\",\"value\":\"224\"},{\"dictionaryId\":570,\"name\":\"潞苑\",\"value\":\"225\"},{\"dictionaryId\":571,\"name\":\"梨园\",\"value\":\"226\"},{\"dictionaryId\":572,\"name\":\"临河里\",\"value\":\"227\"},{\"dictionaryId\":573,\"name\":\"马驹桥\",\"value\":\"228\"},{\"dictionaryId\":574,\"name\":\"乔庄\",\"value\":\"229\"},{\"dictionaryId\":575,\"name\":\"通州北苑\",\"value\":\"230\"},{\"dictionaryId\":576,\"name\":\"通州其它\",\"value\":\"231\"},{\"dictionaryId\":577,\"name\":\"武夷花园\",\"value\":\"232\"},{\"dictionaryId\":578,\"name\":\"新华大街\",\"value\":\"233\"},{\"dictionaryId\":579,\"name\":\"玉桥\",\"value\":\"234\"}],\"value\":\"221\"},{\"dictionaryId\":580,\"name\":\"昌平区\",\"rows\":[{\"dictionaryId\":581,\"name\":\"北七家\",\"value\":\"236\"},{\"dictionaryId\":582,\"name\":\"昌平其它\",\"value\":\"237\"},{\"dictionaryId\":583,\"name\":\"东关\",\"value\":\"238\"},{\"dictionaryId\":584,\"name\":\"鼓楼大街\",\"value\":\"239\"},{\"dictionaryId\":585,\"name\":\"回龙观\",\"value\":\"240\"},{\"dictionaryId\":586,\"name\":\"霍营\",\"value\":\"241\"},{\"dictionaryId\":587,\"name\":\"立水桥\",\"value\":\"242\"},{\"dictionaryId\":588,\"name\":\"龙泽\",\"value\":\"243\"},{\"dictionaryId\":589,\"name\":\"南邵\",\"value\":\"244\"},{\"dictionaryId\":590,\"name\":\"沙河\",\"value\":\"245\"},{\"dictionaryId\":591,\"name\":\"天通苑\",\"value\":\"246\"},{\"dictionaryId\":592,\"name\":\"西关环岛\",\"value\":\"247\"},{\"dictionaryId\":593,\"name\":\"西三旗\",\"value\":\"248\"},{\"dictionaryId\":594,\"name\":\"小汤山\",\"value\":\"249\"},{\"dictionaryId\":595,\"name\":\"安宁庄\",\"value\":\"250\"},{\"dictionaryId\":596,\"name\":\"西二旗\",\"value\":\"251\"}],\"value\":\"235\"},{\"dictionaryId\":597,\"name\":\"大兴区\",\"rows\":[{\"dictionaryId\":598,\"name\":\"大兴其它\",\"value\":\"253\"},{\"dictionaryId\":599,\"name\":\"观音寺\",\"value\":\"254\"},{\"dictionaryId\":600,\"name\":\"黄村火车站\",\"value\":\"255\"},{\"dictionaryId\":601,\"name\":\"黄村北\",\"value\":\"256\"},{\"dictionaryId\":602,\"name\":\"黄村中\",\"value\":\"257\"},{\"dictionaryId\":603,\"name\":\"旧宫\",\"value\":\"258\"},{\"dictionaryId\":604,\"name\":\"科技园区\",\"value\":\"259\"},{\"dictionaryId\":605,\"name\":\"天宫院\",\"value\":\"260\"},{\"dictionaryId\":606,\"name\":\"西红门\",\"value\":\"261\"},{\"dictionaryId\":607,\"name\":\"亦庄开发区其它\",\"value\":\"262\"},{\"dictionaryId\":608,\"name\":\"枣园\",\"value\":\"263\"},{\"dictionaryId\":609,\"name\":\"黄村\",\"value\":\"264\"},{\"dictionaryId\":610,\"name\":\"郁花园\",\"value\":\"265\"},{\"dictionaryId\":611,\"name\":\"高米店南\",\"value\":\"266\"},{\"dictionaryId\":612,\"name\":\"大兴开发区\",\"value\":\"267\"},{\"dictionaryId\":613,\"name\":\"瀛海\",\"value\":\"268\"},{\"dictionaryId\":614,\"name\":\"天宫院南\",\"value\":\"269\"}],\"value\":\"252\"},{\"dictionaryId\":615,\"name\":\"顺义区\",\"rows\":[{\"dictionaryId\":616,\"name\":\"后沙峪\",\"value\":\"271\"},{\"dictionaryId\":617,\"name\":\"李桥\",\"value\":\"272\"},{\"dictionaryId\":618,\"name\":\"马坡\",\"value\":\"273\"},{\"dictionaryId\":619,\"name\":\"顺义城\",\"value\":\"274\"},{\"dictionaryId\":620,\"name\":\"顺义其它\",\"value\":\"275\"},{\"dictionaryId\":621,\"name\":\"首都机场\",\"value\":\"276\"},{\"dictionaryId\":622,\"name\":\"天竺\",\"value\":\"277\"},{\"dictionaryId\":623,\"name\":\"中央别墅区\",\"value\":\"278\"}],\"value\":\"270\"},{\"dictionaryId\":624,\"name\":\"房山区\",\"rows\":[{\"dictionaryId\":625,\"name\":\"长阳\",\"value\":\"280\"},{\"dictionaryId\":626,\"name\":\"良乡\",\"value\":\"281\"},{\"dictionaryId\":627,\"name\":\"阎村\",\"value\":\"282\"},{\"dictionaryId\":628,\"name\":\"房山其它\",\"value\":\"283\"}],\"value\":\"279\"},{\"dictionaryId\":629,\"name\":\"门头沟区\",\"rows\":[{\"dictionaryId\":630,\"name\":\"门头沟其它\",\"value\":\"285\"},{\"dictionaryId\":631,\"name\":\"城子\",\"value\":\"286\"},{\"dictionaryId\":632,\"name\":\"石门营\",\"value\":\"287\"},{\"dictionaryId\":633,\"name\":\"大峪\",\"value\":\"288\"},{\"dictionaryId\":634,\"name\":\"滨河西区\",\"value\":\"289\"},{\"dictionaryId\":635,\"name\":\"冯村\",\"value\":\"290\"},{\"dictionaryId\":636,\"name\":\"石景山其它\",\"value\":\"291\"}],\"value\":\"284\"},{\"dictionaryId\":637,\"name\":\"亦庄开发区\",\"rows\":[{\"dictionaryId\":638,\"name\":\"马驹桥\",\"value\":\"293\"},{\"dictionaryId\":639,\"name\":\"亦庄\",\"value\":\"294\"},{\"dictionaryId\":640,\"name\":\"亦庄开发区其它\",\"value\":\"295\"}],\"value\":\"292\"}],\"value\":\"1\"}],\"meta\":{\"code\":\"200\",\"message\":\"ok\"}}"


    /**
     * 字典值
     */
    const val DICAREA = "dicArea"
    const val DICHOUSEFEATURE = "houseFeature"
    const val DICORIENTATIONTYPE = "orientationType"


    /**
     * HEADERIMG
     */
    const val HEADERIMG = "headerImage"



    /**
     * intent singleKey
     * 废除
     */
    const val ENTITY_FEICHU = "entity"

    /**
     * SEX
     */
    const val SEX = "女、男"

    /**
     * 租金
     */
    const val PAYTYPE = "月付、季付、半年付、年付"

    /**
     * 租金——月付
     */
    const val PAYTYPERENT = "二期支付、三期支付、四期支付、五期支付、六期支付、七期支付、八期支付、九期支付、十期支付、十一期支付、十二期支付"

    /**
     * 租金——季付
     */
    const val PAYTYPERENT2 = "二期支付、三期支付、四期支付"

    /**
     * 租金——季付
     */
    const val PAYTYPERENT3 = "二期支付"

    /**
     * 租金
     */
    const val BANK = "建设银行、农业银行、工商银行、华夏银行"

    /**
     * CONSTELLATION
     */
    const val CONSTELLATION = "白羊座、金牛座、双子座、巨蟹座、狮子座、处女座、天秤座、天蝎座、射手座、摩羯座、水瓶座、双鱼座"

    /**
     * FILE_NAME
     */
    const val FILE_NAME = "yueyazhaofang_broker"

    /**
     * FILE
     */
    const val FILE = "ztzd_broker"

    /**
     * HTTP配置
     */
    const val READ_TIME = 5 * 1000L
    const val WRITE_TIME = 5 * 1000L
    const val CONNECT_TIME = 5 * 1000L

    /**
     * 日志TAG
     */
    const val TAGYUKE = "Yuke"

    /**
     * 登录信息
     */
    const val FIRSTIN = "firstin"

    /**
     * 登录信息
     */
    const val LOGIN = "login"

    /**
     * 用户名
     */
    const val USERNAME = "username"

    /**
     * 密码
     */
    const val PASSWORD = "password"

    /**
     * 大楼ID
     */
    const val BUILDID = "buildId"

    /**
     * 大楼名称
     */
    const val BUILDNAME = "buildName"

    /**
     * 用户ID
     */
    const val USERID = "userid"



    /**
     * 登录用户是否在该手机上登录过
     */
    const val LOGINACCOUNT = "loginAccount"

    /**
     * AesKey
     */
    const val AesKey = "AesKey"

    /**
     * device token
     */
    const val DEVICETOKEN = "devicetoken"

    /**
     * 视频返回code
     */
    const val VIDEOCODE = 101



    /**
     * mType
     */
    const val MTYPE = "mType"
    /**
     * JumpType
     * 跳转类型，用于区分从那个页面进来的
     */
    const val JUMPTYPE = "JumpType"

    /**
     * 管理员 1
     */
    const val ADMINISTRATOR = "administrator"

    /**
     * 搜索历史
     */
    const val HISTORY_DATA = "historyData"

    /**
     * 昵称
     * 个人信息-requestCode
     */
    const val ME_NAME = 9799
    const val ME_PHONE = 9899

    /**
     * 性别
     * 个人信息-requestCode
     */
    const val ME_SEX = 9800

    /**
     * 星座
     * 个人信息-requestCode
     */
    const val ME_START = 9801

    /**
     * 爱好
     * 个人信息-requestCode
     */
    const val ME_FERVOR = 9802

    /**
     * 邮箱
     * 个人信息-requestCode
     */
    const val ME_MAIL = 9803

    /**
     * 身份
     * 个人信息-requestCode
     */
    const val ME_ID = 9804

    /**
     * 个人信息-data-key
     */
    const val ME_VALUE = "value"

    /**
     * 在线委任-data-key
     */
    const val ONLINE_VALUE = "online_value"

    /**
     * 详细描述
     * 在线委任-requestCode
     */
    const val ONLINE_DETAIL = 9805

    /**
     * 联系方式
     * 在线委任-requestCode
     */
    const val ONLINE_CALL = 9806

    /**
     * 维修订单
     * Code
     */
    const val WEIXIU_CODEID = "weixiu_codeid"

    /**
     * 维修订单
     * 是否是详情-Code
     */
    const val WEIXIU_DET = "weixiu_det"

    /**
     * 维修订单
     * TYPE
     */
    const val WEIXIU_TYPE = "weixiu_type"

    /**
     * 维修订单
     * 待派单-Code
     */
    const val KEEP_CODE = "daipaidan"

    /**
     * 维修订单
     * 待上门-Code
     */
    const val GO_CODE = "daishangmen"

    /**
     * 维修订单
     * 待评价-Code
     */
    const val MARK_CODE = "daipingjia"

    /**
     * 密钥内容
     * RsaKey
     * base64 code
     */
    var publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArLUKw5t6lGVussjP71Psz1/uLjXNNVEFOEWFDtY90xuVmWmadKshc+SxC84cojh/m8Y+ebzQDTMbPmww6bNuy4UrddoPpdDj/dWIwGKfndcEveO9xsgCKZExzC26XUHEdsp/osH51Kz4Pj6Qr/Erz5Yf4zJ7cki+mtnIp37PxBO9q45Nr5zoVKcoMjuAkVyWAxK2MX03y6hxDSVRlKYd030qbF3A6uKuB/TVJd7hARUEm0UUFx2IaeEQS3C7JOa3eXDfgRtitR6Vnae3Z4OXyDKP2oSWU0CQqy89mDIP/IlswbU7g4tQqId3xaC39FKyvo0PmqAtZ+UNKA+4gKnWBQIDAQAB"
    var privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCstQrDm3qUZW6yyM/vU+zPX+4uNc01UQU4RYUO1j3TG5WZaZp0qyFz5LELzhyiOH+bxj55vNANMxs+bDDps27LhSt12g+l0OP91YjAYp+d1wS9473GyAIpkTHMLbpdQcR2yn+iwfnUrPg+PpCv8SvPlh/jMntySL6a2cinfs/EE72rjk2vnOhUpygyO4CRXJYDErYxfTfLqHENJVGUph3TfSpsXcDq4q4H9NUl3uEBFQSbRRQXHYhp4RBLcLsk5rd5cN+BG2K1HpWdp7dng5fIMo/ahJZTQJCrLz2YMg/8iWzBtTuDi1Coh3fFoLf0UrK+jQ+aoC1n5Q0oD7iAqdYFAgMBAAECggEAAYmzgMDobfGw8z4cXeb11PXneXleAa4eRAftx/n1PyU/0d0nHzKr6laHE2drNAWZRfeVXwD6VaJsHm7uXj0MYkW7Y0IFFtFTSmjFnjhH8BWgqO6M0NGUoAP3OSMkxZz8OnY8qI7IzPxE/KGS08JBGojdcVOQgQNv+7yEj9CZBIezDnNDjwa4pFvwVGkWfh5sMibYn/WCdRlxrr6eP2mRk5J+NwnrtHdkcA9c/eG+V9wXTitmXjD4x+c/aDxJwk4c43K8x7+aHvVAY93ZPKasBQHKSjJNteDsTD09SXvYHuQLnv4CPSHkg1dZ6mMMcW801xFygsbUyQTbCI9gOPVAKQKBgQDb+KZ+tWieZRLttUosWeiRAt99UIbhShVbDNEocHX0MeFTxGhsChJCGV0BV+zxDe366jqR+LOTe1ZJ9og0EkGky+O1XpATMpuCyfbTD7OLZ/XcSGNgy6hCcRmi8eo7mctaWrTLTP1MMTMIb1dztloJSDdj7X7oqvu45Uip/2vLrQKBgQDI/p5BH5ZwuQn2/8Z91ghe9+uGUPJaer7K5/XZp96TNzN0mX7uIgYEkr4dd2yOaQmAYixhCEt7QYLaJvtR1+H/5ebYZwc4A8GKdWsr2KN8MdJXFzAzgyZSB9cnxDw7cWbO3gse9fnnHnL+F66QZSqo1Hxik4Aj3e7AwkAwLCb+uQKBgQCEjX2m9SIp8LZLT+d2emdOmvCZzyC4ObBMwZh4SeyKTlR96ekS0a7W7fnBiX5adA5oGSVaOQfdY4FH6KuC1U2BROveqzEeoGxdj96QqPGEnAznxSc9ePvXrdfI/QYtDCwiMm6n46jvdOZPuuhz7fqrhTz7lm3XPtGZRXFYH3aRsQKBgBuW99own9HxVHDXQ0PasWN33JifW+UXnED1/kVWSbMjjKiguU+u0+ykx/v7fKc/u9Inp7faD6Jnp7KST0U4wQkDYeCqo88IlPSQkZl/L1HI9PqHcFJh2kzATsRip3Hxaw9SY2xoj1kuUNKYJZokiOqL4FcXsCs8N522DGGQbfnhAoGBALulTIjyYF+0L2HubiDL7QqvyCQGU7o7mqWrqeIEFSaBylfDUVykn+DrIkbPSNUnM0ME8MaK9D5rclpOhsqfK4UkeEmZejh8NhRWoAXVTWKmvEpDczw9ccZttfrJDYTFu7clWvanQoFd9M/sYmZw21jTrjVIdikJ0as7KuBc0Sky"

    /**
     *  签约2 空数据
     */
    val signJson = "{\n" +
            "  \"meta\":{\n" +
            "    \"code\":\"200\",\n" +
            "    \"message\":\"ok\"\n" +
            "  },\n" +
            "  \"data\":{\n" +
            "    \"costs\":[\n" +
            "      {\n" +
            "        \"expenseItem\":\"押金\",\n" +
            "        \"expenseType\":\"代理房屋费用\",\n" +
            "        \"expenseTypeCode\":\"11\",\n" +
            "        \"type\":1,\n" +
            "        \"expenseItemCode\":\"1111\",\n" +
            "        \"value\":0\n" +
            "      },\n" +
            "      {\n" +
            "        \"expenseItem\":\"服务费\",\n" +
            "        \"expenseType\":\"代理房屋费用\",\n" +
            "        \"expenseTypeCode\":\"11\",\n" +
            "        \"type\":1,\n" +
            "        \"expenseItemCode\":\"1108\",\n" +
            "        \"value\":0\n" +
            "      },\n" +
            "      {\n" +
            "        \"expenseItem\":\"卫生费\",\n" +
            "        \"expenseType\":\"代理房屋费用\",\n" +
            "        \"expenseTypeCode\":\"11\",\n" +
            "        \"type\":1,\n" +
            "        \"expenseItemCode\":\"1109\",\n" +
            "        \"value\":0\n" +
            "      },\n" +
            "      {\n" +
            "        \"expenseItem\":\"有线费\",\n" +
            "        \"expenseType\":\"代理房屋费用\",\n" +
            "        \"expenseTypeCode\":\"11\",\n" +
            "        \"type\":1,\n" +
            "        \"expenseItemCode\":\"1110\",\n" +
            "        \"value\":0\n" +
            "      }\n" +
            "    ],\n" +
            "    \"payMethods\":[\n" +
            "      {\n" +
            "        \"labelGroup\":\"付款方式\",\n" +
            "        \"labelValue\":\"1\",\n" +
            "        \"labelName\":\"月付\",\n" +
            "        \"type\":1\n" +
            "      },\n" +
            "      {\n" +
            "        \"labelGroup\":\"付款方式\",\n" +
            "        \"labelValue\":\"2\",\n" +
            "        \"labelName\":\"季付\",\n" +
            "        \"type\":1\n" +
            "      },\n" +
            "      {\n" +
            "        \"labelGroup\":\"付款方式\",\n" +
            "        \"labelValue\":\"3\",\n" +
            "        \"labelName\":\"半年付\",\n" +
            "        \"type\":1\n" +
            "      },\n" +
            "      {\n" +
            "        \"labelGroup\":\"付款方式\",\n" +
            "        \"labelValue\":\"4\",\n" +
            "        \"labelName\":\"年付\",\n" +
            "        \"type\":1\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}"
    //市区正则
    val regexShiQu = "^(北京市)?(海淀|朝阳|丰台|东城|西城|石景山|通州|昌平|大兴|顺义|房山|门头沟|亦庄开发|怀柔)区"
    //数字正则
    val regexNumFormat = "\\.[0]+\$"


}
