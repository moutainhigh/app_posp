package xdt.quickpay.clearQuickPay.entity;

/**
 * 
 * @Description 快捷直清请求信息 
 * @author YanChao.Shang
 * @date 2018年1月05日 下午12:28:08 
 * @version V1.3.1
 */
public class ClearPayRequestEntity {

	private String v_version; //版本号
	
	private String v_mid;  //商户号
	
	private String v_oid;  //订单号
	
	private String v_time; //交易时间
	
	private String v_txnAmt; //交易金额
	
	private String v_realName; //帐户名
	
	private String v_cardNo; //交易卡号
	
	private String v_cert_no;//证件号
	
	private String v_orderInfo; //订单信息
	
	private String v_phone; //交易手机号
	
	private String v_notify_url; //异步通知
	
	private String v_url; //前台通知
	
	private String v_cvn2; //信用卡背面末三位
	
	private String v_expired;//信用卡有效期
	
	private String v_attach; //附加信息
	
	private String v_userId;//用户唯一标识
	
	private String v_userFee;//交易手续费率
	
	private String v_settleCardNo; //结算卡号
	
	private String v_settleName; //结算手机号
	
	private String v_settlePhone; //结算手机号
	
	private String v_settleUserFee; //结算手续费
	
	private String v_settlePmsBankNo;//结算卡号所对应的联行号
	
	private String v_sign; //签名

	public String getV_version() {
		return v_version;
	}

	public void setV_version(String v_version) {
		this.v_version = v_version;
	}

	public String getV_mid() {
		return v_mid;
	}

	public void setV_mid(String v_mid) {
		this.v_mid = v_mid;
	}

	public String getV_oid() {
		return v_oid;
	}

	public void setV_oid(String v_oid) {
		this.v_oid = v_oid;
	}

	public String getV_time() {
		return v_time;
	}

	public void setV_time(String v_time) {
		this.v_time = v_time;
	}

	public String getV_txnAmt() {
		return v_txnAmt;
	}

	public void setV_txnAmt(String v_txnAmt) {
		this.v_txnAmt = v_txnAmt;
	}

	public String getV_realName() {
		return v_realName;
	}

	public void setV_realName(String v_realName) {
		this.v_realName = v_realName;
	}

	public String getV_cardNo() {
		return v_cardNo;
	}

	public void setV_cardNo(String v_cardNo) {
		this.v_cardNo = v_cardNo;
	}

	public String getV_cert_no() {
		return v_cert_no;
	}

	public void setV_cert_no(String v_cert_no) {
		this.v_cert_no = v_cert_no;
	}

	public String getV_orderInfo() {
		return v_orderInfo;
	}

	public void setV_orderInfo(String v_orderInfo) {
		this.v_orderInfo = v_orderInfo;
	}

	public String getV_phone() {
		return v_phone;
	}

	public void setV_phone(String v_phone) {
		this.v_phone = v_phone;
	}

	public String getV_notify_url() {
		return v_notify_url;
	}

	public void setV_notify_url(String v_notify_url) {
		this.v_notify_url = v_notify_url;
	}

	public String getV_url() {
		return v_url;
	}

	public void setV_url(String v_url) {
		this.v_url = v_url;
	}

	public String getV_cvn2() {
		return v_cvn2;
	}

	public void setV_cvn2(String v_cvn2) {
		this.v_cvn2 = v_cvn2;
	}

	public String getV_expired() {
		return v_expired;
	}

	public void setV_expired(String v_expired) {
		this.v_expired = v_expired;
	}

	public String getV_attach() {
		return v_attach;
	}

	public void setV_attach(String v_attach) {
		this.v_attach = v_attach;
	}

	public String getV_userId() {
		return v_userId;
	}

	public void setV_userId(String v_userId) {
		this.v_userId = v_userId;
	}

	public String getV_userFee() {
		return v_userFee;
	}

	public void setV_userFee(String v_userFee) {
		this.v_userFee = v_userFee;
	}

	public String getV_settleCardNo() {
		return v_settleCardNo;
	}

	public void setV_settleCardNo(String v_settleCardNo) {
		this.v_settleCardNo = v_settleCardNo;
	}

	public String getV_settleName() {
		return v_settleName;
	}

	public void setV_settleName(String v_settleName) {
		this.v_settleName = v_settleName;
	}

	public String getV_settlePhone() {
		return v_settlePhone;
	}

	public void setV_settlePhone(String v_settlePhone) {
		this.v_settlePhone = v_settlePhone;
	}

	public String getV_settleUserFee() {
		return v_settleUserFee;
	}

	public void setV_settleUserFee(String v_settleUserFee) {
		this.v_settleUserFee = v_settleUserFee;
	}

	public String getV_settlePmsBankNo() {
		return v_settlePmsBankNo;
	}

	public void setV_settlePmsBankNo(String v_settlePmsBankNo) {
		this.v_settlePmsBankNo = v_settlePmsBankNo;
	}

	public String getV_sign() {
		return v_sign;
	}

	public void setV_sign(String v_sign) {
		this.v_sign = v_sign;
	}
}
