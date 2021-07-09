package com.littonishir.common.network.other


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Login(
    var businessType: String? = null,
    var clientType: String = "",
    var companyCode: String? = null,
    var companyId: String? = null,
    var companyName: String? = null,
    var companyParentIds: String? = null,
    var createTime: String? = null,
    var dataPermissions: List<String> = listOf(),
    var deviceToken: String = "",
    var email: String = "",
    var fullCompanyName: String? = null,
    var id: Int = 0,
    var idNumber: String = "",
    var isEnablePay: String = "",
    var loginName: String = "",
    var logo: String? = null,
    var menu: List<String> = listOf(),
    var menuAndButton: String? = null,
    var menus: String? = null,
    var mobile: String = "",
    var name: String = "",
    var officeCode: String = "",
    var officeId: Int = 0,
    var officeName: String = "",
    var officeParentIds: String? = null,
    var orgFlag: Int = 0,
    var osType: String? = null,
    var password: String = "",
    var photo: String = "",
    var professionalArea: String? = null,
    var professionalAreaId: String? = null,
    var roles: List<String> = listOf(),
    var rolesMap: String? = null,
    var salesDepartment: String? = null,
    var salesDepartmentId: String? = null,
    var sessionid: String? = null,
    var sex: Int = 0,
    var sliceArea: String? = null,
    var sliceAreaId: String? = null,
    var store: String? = null,
    var storeId: String? = null,
    var stringPermissions: List<String> = listOf(),
    var supplierId: String? = null,
    var supplierName: String? = null,
    var supplierUserType: String? = null,
    var theme: String? = null,
    var userType: String = "",
    var userTypeName: String = ""
) : Parcelable