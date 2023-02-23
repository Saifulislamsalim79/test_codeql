package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.play.core.internal.p */
/* loaded from: classes2.dex */
public abstract class AbstractC4991p implements Closeable {
    /* renamed from: c */
    public abstract long mo25887c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public abstract InputStream mo25886g(long j, long j2) throws IOException;

    /* renamed from: m */
    public synchronized InputStream m25902m() throws IOException {
        return mo25886g(0L, mo25887c());
    }
}
