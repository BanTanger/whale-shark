package com.bantanger.im.domain.message.model;

import com.bantanger.im.common.model.ClientInfo;
import lombok.Data;

/**
 * @author BanTanger 半糖
 * @Date 2023/4/4 11:22
 */
@Data
public class MessageContent extends ClientInfo {

    private String messageId;

    private String fromId;

    private String toId;

    private String messageBody;

}
