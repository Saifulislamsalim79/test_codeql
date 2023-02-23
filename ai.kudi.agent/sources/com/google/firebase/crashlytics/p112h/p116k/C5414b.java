package com.google.firebase.crashlytics.p112h.p116k;

import android.content.Context;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
import java.io.File;
/* compiled from: LogFileManager.java */
/* renamed from: com.google.firebase.crashlytics.h.k.b */
/* loaded from: classes2.dex */
public class C5414b {

    /* renamed from: d */
    private static final C5417c f13370d = new C5417c();

    /* renamed from: a */
    private final Context f13371a;

    /* renamed from: b */
    private final InterfaceC5416b f13372b;

    /* renamed from: c */
    private InterfaceC5413a f13373c;

    /* compiled from: LogFileManager.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5416b {
        /* renamed from: a */
        File mo24819a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LogFileManager.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.b$c */
    /* loaded from: classes2.dex */
    public static final class C5417c implements InterfaceC5413a {
        private C5417c() {
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
        /* renamed from: a */
        public void mo24792a() {
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
        /* renamed from: b */
        public String mo24791b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
        /* renamed from: c */
        public byte[] mo24790c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
        /* renamed from: d */
        public void mo24789d() {
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
        /* renamed from: e */
        public void mo24788e(long j, String str) {
        }
    }

    public C5414b(Context context, InterfaceC5416b interfaceC5416b) {
        this(context, interfaceC5416b, null);
    }

    /* renamed from: d */
    private File m24823d(String str) {
        return new File(this.f13372b.mo24819a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* renamed from: a */
    public void m24826a() {
        this.f13373c.mo24789d();
    }

    /* renamed from: b */
    public byte[] m24825b() {
        return this.f13373c.mo24790c();
    }

    /* renamed from: c */
    public String m24824c() {
        return this.f13373c.mo24791b();
    }

    /* renamed from: e */
    public final void m24822e(String str) {
        this.f13373c.mo24792a();
        this.f13373c = f13370d;
        if (str == null) {
            return;
        }
        if (!C5373n.m24991k(this.f13371a, "com.crashlytics.CollectCustomLogs", true)) {
            C5335f.m25102f().m25106b("Preferences requested no custom logs. Aborting log file creation.");
        } else {
            m24821f(m24823d(str), 65536);
        }
    }

    /* renamed from: f */
    void m24821f(File file, int i) {
        this.f13373c = new C5423d(file, i);
    }

    /* renamed from: g */
    public void m24820g(long j, String str) {
        this.f13373c.mo24788e(j, str);
    }

    public C5414b(Context context, InterfaceC5416b interfaceC5416b, String str) {
        this.f13371a = context;
        this.f13372b = interfaceC5416b;
        this.f13373c = f13370d;
        m24822e(str);
    }
}
