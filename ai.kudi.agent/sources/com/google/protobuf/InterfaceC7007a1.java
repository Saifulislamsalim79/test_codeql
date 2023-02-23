package com.google.protobuf;

import java.io.InputStream;
/* compiled from: Parser.java */
/* renamed from: com.google.protobuf.a1 */
/* loaded from: classes2.dex */
public interface InterfaceC7007a1<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException;

    MessageType parseFrom(AbstractC7039i abstractC7039i) throws InvalidProtocolBufferException;

    MessageType parseFrom(AbstractC7039i abstractC7039i, C7089p c7089p) throws InvalidProtocolBufferException;

    MessageType parseFrom(AbstractC7052j abstractC7052j) throws InvalidProtocolBufferException;

    MessageType parseFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream, C7089p c7089p) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, C7089p c7089p) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException;
}
