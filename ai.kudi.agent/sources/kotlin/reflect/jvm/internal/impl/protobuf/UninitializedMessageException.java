package kotlin.reflect.jvm.internal.impl.protobuf;
/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(InterfaceC13601o interfaceC13601o) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m4556a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
