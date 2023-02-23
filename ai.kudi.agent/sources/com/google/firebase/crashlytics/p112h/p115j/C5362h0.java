package com.google.firebase.crashlytics.p112h.p115j;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p116k.C5414b;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.crashlytics.p112h.p117l.C5492b0;
import com.google.firebase.crashlytics.p112h.p120n.C5576g;
import com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h;
import com.google.firebase.crashlytics.p112h.p121o.C5581c;
import com.google.firebase.crashlytics.p112h.p122p.InterfaceC5587e;
import com.google.firebase.crashlytics.p112h.p125q.InterfaceC5602d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: SessionReportingCoordinator.java */
/* renamed from: com.google.firebase.crashlytics.h.j.h0 */
/* loaded from: classes2.dex */
public class C5362h0 {

    /* renamed from: a */
    private final C5401s f13225a;

    /* renamed from: b */
    private final C5576g f13226b;

    /* renamed from: c */
    private final C5581c f13227c;

    /* renamed from: d */
    private final C5414b f13228d;

    /* renamed from: e */
    private final C5366j0 f13229e;

    C5362h0(C5401s c5401s, C5576g c5576g, C5581c c5581c, C5414b c5414b, C5366j0 c5366j0) {
        this.f13225a = c5401s;
        this.f13226b = c5576g;
        this.f13227c = c5581c;
        this.f13228d = c5414b;
        this.f13229e = c5366j0;
    }

    /* renamed from: a */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d m25051a(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d) {
        return m25050b(abstractC5465d, this.f13228d, this.f13229e);
    }

    /* renamed from: b */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d m25050b(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d, C5414b c5414b, C5366j0 c5366j0) {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24581g = abstractC5465d.mo24581g();
        String m24824c = c5414b.m24824c();
        if (m24824c != null) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a m24735a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.m24735a();
            m24735a.mo24491b(m24824c);
            mo24581g.mo24577d(m24735a.mo24492a());
        } else {
            C5335f.m25102f().m25099i("No log data to include with this event.");
        }
        List<AbstractC5448a0.AbstractC5452c> m25043i = m25043i(c5366j0.m25029a());
        List<AbstractC5448a0.AbstractC5452c> m25043i2 = m25043i(c5366j0.m25028b());
        if (!m25043i.isEmpty()) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24569g = abstractC5465d.mo24586b().mo24569g();
            mo24569g.mo24566c(C5492b0.m24714d(m25043i));
            mo24569g.mo24564e(C5492b0.m24714d(m25043i2));
            mo24581g.mo24579b(mo24569g.mo24568a());
        }
        return mo24581g.mo24580a();
    }

    /* renamed from: c */
    private static AbstractC5448a0.AbstractC5449a m25049c(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m25048d(traceInputStream);
            }
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25097k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        AbstractC5448a0.AbstractC5449a.AbstractC5450a m24757a = AbstractC5448a0.AbstractC5449a.m24757a();
        m24757a.mo24703b(applicationExitInfo.getImportance());
        m24757a.mo24701d(applicationExitInfo.getProcessName());
        m24757a.mo24699f(applicationExitInfo.getReason());
        m24757a.mo24697h(applicationExitInfo.getTimestamp());
        m24757a.mo24702c(applicationExitInfo.getPid());
        m24757a.mo24700e(applicationExitInfo.getPss());
        m24757a.mo24698g(applicationExitInfo.getRss());
        m24757a.mo24696i(str);
        return m24757a.mo24704a();
    }

    /* renamed from: d */
    public static String m25048d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    /* renamed from: e */
    public static C5362h0 m25047e(Context context, C5347a0 c5347a0, InterfaceC5577h interfaceC5577h, C5361h c5361h, C5414b c5414b, C5366j0 c5366j0, InterfaceC5602d interfaceC5602d, InterfaceC5587e interfaceC5587e) {
        return new C5362h0(new C5401s(context, c5347a0, c5361h, interfaceC5602d), new C5576g(new File(interfaceC5577h.mo24406a()), interfaceC5587e), C5581c.m24403a(context), c5414b, c5366j0);
    }

    /* renamed from: h */
    private ApplicationExitInfo m25044h(String str, List<ApplicationExitInfo> list) {
        long m24416q = this.f13226b.m24416q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m24416q) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: i */
    private static List<AbstractC5448a0.AbstractC5452c> m25043i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AbstractC5448a0.AbstractC5452c.AbstractC5453a m24756a = AbstractC5448a0.AbstractC5452c.m24756a();
            m24756a.mo24688b(entry.getKey());
            m24756a.mo24687c(entry.getValue());
            arrayList.add(m24756a.mo24689a());
        }
        Collections.sort(arrayList, C5352d.f13208c);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public boolean m25037o(j<AbstractC5402t> jVar) {
        if (jVar.p()) {
            AbstractC5402t abstractC5402t = (AbstractC5402t) jVar.l();
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25106b("Crashlytics report successfully enqueued to DataTransport: " + abstractC5402t.mo24851c());
            this.f13226b.m24426g(abstractC5402t.mo24851c());
            return true;
        }
        C5335f.m25102f().m25096l("Crashlytics report could not be enqueued to DataTransport", jVar.k());
        return false;
    }

    /* renamed from: p */
    private void m25036p(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.f13226b.m24445E(m25051a(this.f13225a.m24875c(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    /* renamed from: f */
    public void m25046f(String str, List<InterfaceC5358f0> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5358f0 interfaceC5358f0 : list) {
            AbstractC5448a0.AbstractC5454d.AbstractC5456b mo24828c = interfaceC5358f0.mo24828c();
            if (mo24828c != null) {
                arrayList.add(mo24828c);
            }
        }
        C5576g c5576g = this.f13226b;
        AbstractC5448a0.AbstractC5454d.AbstractC5455a m24755a = AbstractC5448a0.AbstractC5454d.m24755a();
        m24755a.mo24651b(C5492b0.m24714d(arrayList));
        c5576g.m24424i(str, m24755a.mo24652a());
    }

    /* renamed from: g */
    public void m25045g(long j, String str) {
        this.f13226b.m24425h(str, j);
    }

    /* renamed from: j */
    public boolean m25042j() {
        return this.f13226b.m24415r();
    }

    /* renamed from: m */
    public List<String> m25039m() {
        return this.f13226b.m24449A();
    }

    /* renamed from: n */
    public void m25038n(String str, long j) {
        this.f13226b.m24444F(this.f13225a.m24874d(str, j));
    }

    /* renamed from: q */
    public void m25035q(Throwable th, Thread thread, String str, long j) {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Persisting fatal event for session " + str);
        m25036p(th, thread, str, "crash", j, true);
    }

    /* renamed from: r */
    public void m25034r(Throwable th, Thread thread, String str, long j) {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Persisting non-fatal event for session " + str);
        m25036p(th, thread, str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, j, false);
    }

    /* renamed from: s */
    public void m25033s(String str, List<ApplicationExitInfo> list, C5414b c5414b, C5366j0 c5366j0) {
        ApplicationExitInfo m25044h = m25044h(str, list);
        if (m25044h == null) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25099i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC5448a0.AbstractC5458e.AbstractC5465d m24876b = this.f13225a.m24876b(m25049c(m25044h));
        C5335f m25102f2 = C5335f.m25102f();
        m25102f2.m25106b("Persisting anr for session " + str);
        this.f13226b.m24445E(m25050b(m24876b, c5414b, c5366j0), str, true);
    }

    /* renamed from: t */
    public void m25032t(String str) {
        String m25027c = this.f13229e.m25027c();
        if (m25027c == null) {
            C5335f.m25102f().m25099i("Could not persist user ID; no user ID available");
        } else {
            this.f13226b.m24443G(m25027c, str);
        }
    }

    /* renamed from: u */
    public void m25031u() {
        this.f13226b.m24427f();
    }

    /* renamed from: v */
    public j<Void> m25030v(Executor executor) {
        List<AbstractC5402t> m24448B = this.f13226b.m24448B();
        ArrayList arrayList = new ArrayList();
        for (AbstractC5402t abstractC5402t : m24448B) {
            arrayList.add(this.f13227c.m24399e(abstractC5402t).i(executor, new InterfaceC4450c() { // from class: com.google.firebase.crashlytics.h.j.c
                @Override // com.google.android.gms.tasks.InterfaceC4450c
                /* renamed from: a */
                public final Object mo20893a(j jVar) {
                    boolean m25037o;
                    m25037o = C5362h0.this.m25037o(jVar);
                    return Boolean.valueOf(m25037o);
                }
            }));
        }
        return C4469m.m27764g(arrayList);
    }
}
