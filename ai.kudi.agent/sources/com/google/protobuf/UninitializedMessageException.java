package com.google.protobuf;
/* loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(InterfaceC7100r0 interfaceC7100r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m20244a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
