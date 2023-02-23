package androidx.core.p058os;

import p201g.p227h.p237k.C7670c;
/* renamed from: androidx.core.os.OperationCanceledException */
/* loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(C7670c.m17873c(str, "The operation has been canceled."));
    }
}
