package org.apache.commons.p595io;

import java.io.IOException;
/* renamed from: org.apache.commons.io.TaggedIOException */
/* loaded from: classes3.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    /* renamed from: a */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
