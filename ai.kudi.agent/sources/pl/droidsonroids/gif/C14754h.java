package pl.droidsonroids.gif;

import android.content.Context;
import pl.droidsonroids.relinker.C14761b;
/* compiled from: LibraryLoader.java */
/* renamed from: pl.droidsonroids.gif.h */
/* loaded from: classes3.dex */
public class C14754h {

    /* renamed from: a */
    private static Context f33016a;

    /* renamed from: a */
    private static Context m394a() {
        if (f33016a == null) {
            try {
                f33016a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f33016a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m393b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            C14761b.m384a(m394a(), "pl_droidsonroids_gif");
        }
    }
}
