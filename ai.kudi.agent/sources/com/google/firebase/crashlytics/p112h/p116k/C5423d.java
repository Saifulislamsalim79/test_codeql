package com.google.firebase.crashlytics.p112h.p116k;

import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p115j.C5373n;
import com.google.firebase.crashlytics.p112h.p116k.C5418c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* compiled from: QueueFileLogStore.java */
/* renamed from: com.google.firebase.crashlytics.h.k.d */
/* loaded from: classes2.dex */
class C5423d implements InterfaceC5413a {

    /* renamed from: d */
    private static final Charset f13389d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f13390a;

    /* renamed from: b */
    private final int f13391b;

    /* renamed from: c */
    private C5418c f13392c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.d$a */
    /* loaded from: classes2.dex */
    public class C5424a implements C5418c.InterfaceC5422d {

        /* renamed from: a */
        final /* synthetic */ byte[] f13393a;

        /* renamed from: b */
        final /* synthetic */ int[] f13394b;

        C5424a(C5423d c5423d, byte[] bArr, int[] iArr) {
            this.f13393a = bArr;
            this.f13394b = iArr;
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.C5418c.InterfaceC5422d
        /* renamed from: a */
        public void mo24784a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f13393a, this.f13394b[0], i);
                int[] iArr = this.f13394b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.d$b */
    /* loaded from: classes2.dex */
    public static class C5425b {

        /* renamed from: a */
        public final byte[] f13395a;

        /* renamed from: b */
        public final int f13396b;

        C5425b(byte[] bArr, int i) {
            this.f13395a = bArr;
            this.f13396b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5423d(File file, int i) {
        this.f13390a = file;
        this.f13391b = i;
    }

    /* renamed from: f */
    private void m24787f(long j, String str) {
        int i;
        if (this.f13392c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f13391b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f13392c.m24812I(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f13389d));
            while (!this.f13392c.m24806Z() && this.f13392c.m24818A0() > this.f13391b) {
                this.f13392c.m24796u0();
            }
        } catch (IOException e) {
            C5335f.m25102f().m25103e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: g */
    private C5425b m24786g() {
        if (this.f13390a.exists()) {
            m24785h();
            C5418c c5418c = this.f13392c;
            if (c5418c == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[c5418c.m24818A0()];
            try {
                this.f13392c.m24808V(new C5424a(this, bArr, iArr));
            } catch (IOException e) {
                C5335f.m25102f().m25103e("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new C5425b(bArr, iArr[0]);
        }
        return null;
    }

    /* renamed from: h */
    private void m24785h() {
        if (this.f13392c == null) {
            try {
                this.f13392c = new C5418c(this.f13390a);
            } catch (IOException e) {
                C5335f m25102f = C5335f.m25102f();
                m25102f.m25103e("Could not open log file: " + this.f13390a, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
    /* renamed from: a */
    public void mo24792a() {
        C5373n.m24997e(this.f13392c, "There was a problem closing the Crashlytics log file.");
        this.f13392c = null;
    }

    @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
    /* renamed from: b */
    public String mo24791b() {
        byte[] mo24790c = mo24790c();
        if (mo24790c != null) {
            return new String(mo24790c, f13389d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
    /* renamed from: c */
    public byte[] mo24790c() {
        C5425b m24786g = m24786g();
        if (m24786g == null) {
            return null;
        }
        int i = m24786g.f13396b;
        byte[] bArr = new byte[i];
        System.arraycopy(m24786g.f13395a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
    /* renamed from: d */
    public void mo24789d() {
        mo24792a();
        this.f13390a.delete();
    }

    @Override // com.google.firebase.crashlytics.p112h.p116k.InterfaceC5413a
    /* renamed from: e */
    public void mo24788e(long j, String str) {
        m24785h();
        m24787f(j, str);
    }
}
