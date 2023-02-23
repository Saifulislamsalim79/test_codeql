package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
/* loaded from: classes2.dex */
public final class C2973k {
    /* renamed from: a */
    public static void m31523a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
