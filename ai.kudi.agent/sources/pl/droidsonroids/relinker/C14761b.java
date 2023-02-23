package pl.droidsonroids.relinker;

import android.content.Context;
import java.io.File;
/* compiled from: ReLinker.java */
/* renamed from: pl.droidsonroids.relinker.b */
/* loaded from: classes3.dex */
public class C14761b {

    /* compiled from: ReLinker.java */
    /* renamed from: pl.droidsonroids.relinker.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14762a {
        /* renamed from: a */
        void mo382a(Context context, String[] strArr, String str, File file, C14766c c14766c);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: pl.droidsonroids.relinker.b$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14763b {
        /* renamed from: a */
        String mo369a(String str);

        /* renamed from: b */
        String mo368b(String str);

        /* renamed from: c */
        String[] mo367c();

        /* renamed from: d */
        void mo366d(String str);

        void loadLibrary(String str);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: pl.droidsonroids.relinker.b$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC14764c {
        /* renamed from: a */
        void m381a();

        /* renamed from: b */
        void m380b(Throwable th);
    }

    /* compiled from: ReLinker.java */
    /* renamed from: pl.droidsonroids.relinker.b$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC14765d {
        /* renamed from: a */
        void m379a(String str);
    }

    /* renamed from: a */
    public static void m384a(Context context, String str) {
        m383b(context, str, null, null);
    }

    /* renamed from: b */
    public static void m383b(Context context, String str, String str2, InterfaceC14764c interfaceC14764c) {
        new C14766c().m373f(context, str, str2, interfaceC14764c);
    }
}
