package com.ucf.checkbalance.pojo;

import java.util.Date;

public class UcfCheckBalance {
    /**
     * null
     */
    private String id;

    /**
     * 凭证号
     */
    private String voucherNo;

    /**
     * 调账类型1001：调增; 1002：调减; 1003：线下充值; 1004：退款.
     */
    private String checkBalanceType;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 金额
     */
    private Long transAmount;

    /**
     * 外部订单号
     */
    private String outOrderNo;

    /**
     * 可变标识,默认、成功为0, 交易失败为id
     */
    private String seqNo;

    /**
     * 调账备注
     */
    private String remark;

    /**
     * 高级产品编码
     */
    private String seniorProductCode;

    /**
     * 币种
     */
    private String transCur;

    /**
     * 摘要
     */
    private String abstractNo;

    /**
     * 摘要内容
     */
    private String abstractContent;

    /**
     * 调账状态 0.未调账 1.成功 2.失败
     */
    private String transStatus;

    /**
     * 审核状态 0.处理中 1.成功 2.失败
     */
    private String auditStatus;

    /**
     * 审核备注
     */
    private String auditRemark;

    /**
     * 提交人
     */
    private String submitAuditor;

    /**
     * 审核人
     */
    private String auditor;

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 交互系统异常消息
     */
    private String exceptionMsg;

    /**
     * 交互系统异常编码
     */
    private String exceptionCode;

    /**
     * 数据类型：0.调账 1.交易
     */
    private String dataType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 给跨境发送mq状态,默认为空，2代表成功
     */
    private String sendStatus;

    /**
     * 是否有真实资金变动：是，1；否，0
     */
    private String isCapitalChange;

    /**
     * 收款人姓名
     */
    private String receiveUsername;

    /**
     * 收款人账号
     */
    private String receiveAccountNo;

    /**
     * 收款开户行
     */
    private String receiveBank;

    /**
     * 收款用途
     */
    private String receiveUsefor;

    /**
     * null
     */
    private String userId;

    /**
     * 商户订单号
     */
    private String merchantOrderNo;

    /**
     * 渠道流水号
     */
    private String settleSequenceNo;

    /**
     * null
     */
    private String accountNo;

    /**
     * null
     */
    private String accountName;

    /**
     * null
     */
    private String channelCode;

    /**
     * null
     * @return ID null
     */
    public String getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 凭证号
     * @return VOUCHER_NO 凭证号
     */
    public String getVoucherNo() {
        return voucherNo;
    }

    /**
     * 凭证号
     * @param voucherNo 凭证号
     */
    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo == null ? null : voucherNo.trim();
    }

    /**
     * 调账类型1001：调增; 1002：调减; 1003：线下充值; 1004：退款.
     * @return CHECK_BALANCE_TYPE 调账类型1001：调增; 1002：调减; 1003：线下充值; 1004：退款.
     */
    public String getCheckBalanceType() {
        return checkBalanceType;
    }

    /**
     * 调账类型1001：调增; 1002：调减; 1003：线下充值; 1004：退款.
     * @param checkBalanceType 调账类型1001：调增; 1002：调减; 1003：线下充值; 1004：退款.
     */
    public void setCheckBalanceType(String checkBalanceType) {
        this.checkBalanceType = checkBalanceType == null ? null : checkBalanceType.trim();
    }

    /**
     * 账户类型
     * @return ACCOUNT_TYPE 账户类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 账户类型
     * @param accountType 账户类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 商户号
     * @return MERCHANT_ID 商户号
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 商户号
     * @param merchantId 商户号
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    /**
     * 金额
     * @return TRANS_AMOUNT 金额
     */
    public Long getTransAmount() {
        return transAmount;
    }

    /**
     * 金额
     * @param transAmount 金额
     */
    public void setTransAmount(Long transAmount) {
        this.transAmount = transAmount;
    }

    /**
     * 外部订单号
     * @return OUT_ORDER_NO 外部订单号
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    /**
     * 外部订单号
     * @param outOrderNo 外部订单号
     */
    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    /**
     * 可变标识,默认、成功为0, 交易失败为id
     * @return SEQ_NO 可变标识,默认、成功为0, 交易失败为id
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 可变标识,默认、成功为0, 交易失败为id
     * @param seqNo 可变标识,默认、成功为0, 交易失败为id
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    /**
     * 调账备注
     * @return REMARK 调账备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 调账备注
     * @param remark 调账备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 高级产品编码
     * @return SENIOR_PRODUCT_CODE 高级产品编码
     */
    public String getSeniorProductCode() {
        return seniorProductCode;
    }

    /**
     * 高级产品编码
     * @param seniorProductCode 高级产品编码
     */
    public void setSeniorProductCode(String seniorProductCode) {
        this.seniorProductCode = seniorProductCode == null ? null : seniorProductCode.trim();
    }

    /**
     * 币种
     * @return TRANS_CUR 币种
     */
    public String getTransCur() {
        return transCur;
    }

    /**
     * 币种
     * @param transCur 币种
     */
    public void setTransCur(String transCur) {
        this.transCur = transCur == null ? null : transCur.trim();
    }

    /**
     * 摘要
     * @return ABSTRACT_NO 摘要
     */
    public String getAbstractNo() {
        return abstractNo;
    }

    /**
     * 摘要
     * @param abstractNo 摘要
     */
    public void setAbstractNo(String abstractNo) {
        this.abstractNo = abstractNo == null ? null : abstractNo.trim();
    }

    /**
     * 摘要内容
     * @return ABSTRACT_CONTENT 摘要内容
     */
    public String getAbstractContent() {
        return abstractContent;
    }

    /**
     * 摘要内容
     * @param abstractContent 摘要内容
     */
    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent == null ? null : abstractContent.trim();
    }

    /**
     * 调账状态 0.未调账 1.成功 2.失败
     * @return TRANS_STATUS 调账状态 0.未调账 1.成功 2.失败
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * 调账状态 0.未调账 1.成功 2.失败
     * @param transStatus 调账状态 0.未调账 1.成功 2.失败
     */
    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    /**
     * 审核状态 0.处理中 1.成功 2.失败
     * @return AUDIT_STATUS 审核状态 0.处理中 1.成功 2.失败
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态 0.处理中 1.成功 2.失败
     * @param auditStatus 审核状态 0.处理中 1.成功 2.失败
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * 审核备注
     * @return AUDIT_REMARK 审核备注
     */
    public String getAuditRemark() {
        return auditRemark;
    }

    /**
     * 审核备注
     * @param auditRemark 审核备注
     */
    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    /**
     * 提交人
     * @return SUBMIT_AUDITOR 提交人
     */
    public String getSubmitAuditor() {
        return submitAuditor;
    }

    /**
     * 提交人
     * @param submitAuditor 提交人
     */
    public void setSubmitAuditor(String submitAuditor) {
        this.submitAuditor = submitAuditor == null ? null : submitAuditor.trim();
    }

    /**
     * 审核人
     * @return AUDITOR 审核人
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * 审核人
     * @param auditor 审核人
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * 交易流水号
     * @return TRADE_NO 交易流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 交易流水号
     * @param tradeNo 交易流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * 交互系统异常消息
     * @return EXCEPTION_MSG 交互系统异常消息
     */
    public String getExceptionMsg() {
        return exceptionMsg;
    }

    /**
     * 交互系统异常消息
     * @param exceptionMsg 交互系统异常消息
     */
    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg == null ? null : exceptionMsg.trim();
    }

    /**
     * 交互系统异常编码
     * @return EXCEPTION_CODE 交互系统异常编码
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * 交互系统异常编码
     * @param exceptionCode 交互系统异常编码
     */
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode == null ? null : exceptionCode.trim();
    }

    /**
     * 数据类型：0.调账 1.交易
     * @return DATA_TYPE 数据类型：0.调账 1.交易
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 数据类型：0.调账 1.交易
     * @param dataType 数据类型：0.调账 1.交易
     */
    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return UPDATE_TIME 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 给跨境发送mq状态,默认为空，2代表成功
     * @return SEND_STATUS 给跨境发送mq状态,默认为空，2代表成功
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * 给跨境发送mq状态,默认为空，2代表成功
     * @param sendStatus 给跨境发送mq状态,默认为空，2代表成功
     */
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    /**
     * 是否有真实资金变动：是，1；否，0
     * @return IS_CAPITAL_CHANGE 是否有真实资金变动：是，1；否，0
     */
    public String getIsCapitalChange() {
        return isCapitalChange;
    }

    /**
     * 是否有真实资金变动：是，1；否，0
     * @param isCapitalChange 是否有真实资金变动：是，1；否，0
     */
    public void setIsCapitalChange(String isCapitalChange) {
        this.isCapitalChange = isCapitalChange == null ? null : isCapitalChange.trim();
    }

    /**
     * 收款人姓名
     * @return RECEIVE_USERNAME 收款人姓名
     */
    public String getReceiveUsername() {
        return receiveUsername;
    }

    /**
     * 收款人姓名
     * @param receiveUsername 收款人姓名
     */
    public void setReceiveUsername(String receiveUsername) {
        this.receiveUsername = receiveUsername == null ? null : receiveUsername.trim();
    }

    /**
     * 收款人账号
     * @return RECEIVE_ACCOUNT_NO 收款人账号
     */
    public String getReceiveAccountNo() {
        return receiveAccountNo;
    }

    /**
     * 收款人账号
     * @param receiveAccountNo 收款人账号
     */
    public void setReceiveAccountNo(String receiveAccountNo) {
        this.receiveAccountNo = receiveAccountNo == null ? null : receiveAccountNo.trim();
    }

    /**
     * 收款开户行
     * @return RECEIVE_BANK 收款开户行
     */
    public String getReceiveBank() {
        return receiveBank;
    }

    /**
     * 收款开户行
     * @param receiveBank 收款开户行
     */
    public void setReceiveBank(String receiveBank) {
        this.receiveBank = receiveBank == null ? null : receiveBank.trim();
    }

    /**
     * 收款用途
     * @return RECEIVE_USEFOR 收款用途
     */
    public String getReceiveUsefor() {
        return receiveUsefor;
    }

    /**
     * 收款用途
     * @param receiveUsefor 收款用途
     */
    public void setReceiveUsefor(String receiveUsefor) {
        this.receiveUsefor = receiveUsefor == null ? null : receiveUsefor.trim();
    }

    /**
     * null
     * @return USER_ID null
     */
    public String getUserId() {
        return userId;
    }

    /**
     * null
     * @param userId null
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 商户订单号
     * @return MERCHANT_ORDER_NO 商户订单号
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * 商户订单号
     * @param merchantOrderNo 商户订单号
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * 渠道流水号
     * @return SETTLE_SEQUENCE_NO 渠道流水号
     */
    public String getSettleSequenceNo() {
        return settleSequenceNo;
    }

    /**
     * 渠道流水号
     * @param settleSequenceNo 渠道流水号
     */
    public void setSettleSequenceNo(String settleSequenceNo) {
        this.settleSequenceNo = settleSequenceNo == null ? null : settleSequenceNo.trim();
    }

    /**
     * null
     * @return ACCOUNT_NO null
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * null
     * @param accountNo null
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * null
     * @return ACCOUNT_NAME null
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * null
     * @param accountName null
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * null
     * @return CHANNEL_CODE null
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * null
     * @param channelCode null
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }
}