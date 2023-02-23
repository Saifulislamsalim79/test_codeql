package com.google.firebase.crashlytics.p112h.p115j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
import com.google.firebase.crashlytics.p112h.p117l.C5492b0;
import com.google.firebase.crashlytics.p112h.p125q.C5603e;
import com.google.firebase.crashlytics.p112h.p125q.InterfaceC5602d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: CrashlyticsReportDataCapture.java */
/* renamed from: com.google.firebase.crashlytics.h.j.s */
/* loaded from: classes2.dex */
public class C5401s {

    /* renamed from: e */
    private static final Map<String, Integer> f13336e;

    /* renamed from: f */
    static final String f13337f;

    /* renamed from: a */
    private final Context f13338a;

    /* renamed from: b */
    private final C5347a0 f13339b;

    /* renamed from: c */
    private final C5361h f13340c;

    /* renamed from: d */
    private final InterfaceC5602d f13341d;

    static {
        HashMap hashMap = new HashMap();
        f13336e = hashMap;
        hashMap.put("armeabi", 5);
        f13336e.put("armeabi-v7a", 6);
        f13336e.put("arm64-v8a", 9);
        f13336e.put("x86", 0);
        f13336e.put("x86_64", 1);
        f13337f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.4");
    }

    public C5401s(Context context, C5347a0 c5347a0, C5361h c5361h, InterfaceC5602d interfaceC5602d) {
        this.f13338a = context;
        this.f13339b = c5347a0;
        this.f13340c = c5361h;
        this.f13341d = interfaceC5602d;
    }

    /* renamed from: a */
    private AbstractC5448a0.AbstractC5451b m24877a() {
        AbstractC5448a0.AbstractC5451b m24761b = AbstractC5448a0.m24761b();
        m24761b.mo24716h("18.2.4");
        m24761b.mo24720d(this.f13340c.f13218a);
        m24761b.mo24719e(this.f13339b.mo25073a());
        m24761b.mo24722b(this.f13340c.f13222e);
        m24761b.mo24721c(this.f13340c.f13223f);
        m24761b.mo24717g(4);
        return m24761b;
    }

    /* renamed from: e */
    private static int m24873e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f13336e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: f */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a m24872f() {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a m24743a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.m24743a();
        m24743a.mo24546b(0L);
        m24743a.mo24544d(0L);
        m24743a.mo24545c(this.f13340c.f13221d);
        m24743a.mo24543e(this.f13340c.f13219b);
        return m24743a.mo24547a();
    }

    /* renamed from: g */
    private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> m24871g() {
        return C5492b0.m24713e(m24872f());
    }

    /* renamed from: h */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a m24870h(int i, AbstractC5448a0.AbstractC5449a abstractC5449a) {
        boolean z = abstractC5449a.mo24712b() != 100;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a m24745a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.m24745a();
        m24745a.mo24567b(Boolean.valueOf(z));
        m24745a.mo24563f(i);
        m24745a.mo24565d(m24865m(abstractC5449a));
        return m24745a.mo24568a();
    }

    /* renamed from: i */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a m24869i(int i, C5603e c5603e, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo m24992j = C5373n.m24992j(this.f13340c.f13221d, this.f13338a);
        if (m24992j != null) {
            bool = Boolean.valueOf(m24992j.importance != 100);
        } else {
            bool = null;
        }
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a m24745a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.m24745a();
        m24745a.mo24567b(bool);
        m24745a.mo24563f(i);
        m24745a.mo24565d(m24864n(c5603e, thread, i2, i3, z));
        return m24745a.mo24568a();
    }

    /* renamed from: j */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c m24868j(int i) {
        C5367k m25023a = C5367k.m25023a(this.f13338a);
        Float m25022b = m25023a.m25022b();
        Double valueOf = m25022b != null ? Double.valueOf(m25022b.doubleValue()) : null;
        int m25021c = m25023a.m25021c();
        boolean m24987o = C5373n.m24987o(this.f13338a);
        long m24983s = C5373n.m24983s() - C5373n.m25001a(this.f13338a);
        long m25000b = C5373n.m25000b(Environment.getDataDirectory().getPath());
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a m24736a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.m24736a();
        m24736a.mo24499b(valueOf);
        m24736a.mo24498c(m25021c);
        m24736a.mo24495f(m24987o);
        m24736a.mo24496e(i);
        m24736a.mo24494g(m24983s);
        m24736a.mo24497d(m25000b);
        return m24736a.mo24500a();
    }

    /* renamed from: k */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c m24867k(C5603e c5603e, int i, int i2) {
        return m24866l(c5603e, i, i2, 0);
    }

    /* renamed from: l */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c m24866l(C5603e c5603e, int i, int i2, int i3) {
        String str = c5603e.f13812b;
        String str2 = c5603e.f13811a;
        StackTraceElement[] stackTraceElementArr = c5603e.f13813c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C5603e c5603e2 = c5603e.f13814d;
        if (i3 >= i2) {
            C5603e c5603e3 = c5603e2;
            while (c5603e3 != null) {
                c5603e3 = c5603e3.f13814d;
                i4++;
            }
        }
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a m24740a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.m24740a();
        m24740a.mo24532f(str);
        m24740a.mo24533e(str2);
        m24740a.mo24535c(C5492b0.m24714d(m24862p(stackTraceElementArr, i)));
        m24740a.mo24534d(i4);
        if (c5603e2 != null && i4 == 0) {
            m24740a.mo24536b(m24866l(c5603e2, i, i2, i3 + 1));
        }
        return m24740a.mo24537a();
    }

    /* renamed from: m */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b m24865m(AbstractC5448a0.AbstractC5449a abstractC5449a) {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b m24744a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.m24744a();
        m24744a.mo24556b(abstractC5449a);
        m24744a.mo24553e(m24857u());
        m24744a.mo24555c(m24871g());
        return m24744a.mo24557a();
    }

    /* renamed from: n */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b m24864n(C5603e c5603e, Thread thread, int i, int i2, boolean z) {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b m24744a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.m24744a();
        m24744a.mo24552f(m24854x(c5603e, thread, i, z));
        m24744a.mo24554d(m24867k(c5603e, i, i2));
        m24744a.mo24553e(m24857u());
        m24744a.mo24555c(m24871g());
        return m24744a.mo24557a();
    }

    /* renamed from: o */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b m24863o(StackTraceElement stackTraceElement, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a abstractC5479a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        abstractC5479a.mo24508e(max);
        abstractC5479a.mo24507f(str);
        abstractC5479a.mo24511b(fileName);
        abstractC5479a.mo24509d(j);
        return abstractC5479a.mo24512a();
    }

    /* renamed from: p */
    private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> m24862p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a m24737a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.m24737a();
            m24737a.mo24510c(i);
            arrayList.add(m24863o(stackTraceElement, m24737a));
        }
        return C5492b0.m24714d(arrayList);
    }

    /* renamed from: q */
    private AbstractC5448a0.AbstractC5458e.AbstractC5459a m24861q() {
        AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a m24749a = AbstractC5448a0.AbstractC5458e.AbstractC5459a.m24749a();
        m24749a.mo24609e(this.f13339b.m25082f());
        m24749a.mo24607g(this.f13340c.f13222e);
        m24749a.mo24610d(this.f13340c.f13223f);
        m24749a.mo24608f(this.f13339b.mo25073a());
        String mo24347a = this.f13340c.f13224g.mo24347a();
        if (mo24347a != null) {
            m24749a.mo24612b("Unity");
            m24749a.mo24611c(mo24347a);
        }
        return m24749a.mo24613a();
    }

    /* renamed from: r */
    private AbstractC5448a0.AbstractC5458e m24860r(String str, long j) {
        AbstractC5448a0.AbstractC5458e.AbstractC5462b m24753a = AbstractC5448a0.AbstractC5458e.m24753a();
        m24753a.mo24622l(j);
        m24753a.mo24624i(str);
        m24753a.mo24626g(f13337f);
        m24753a.mo24631b(m24861q());
        m24753a.mo24623k(m24858t());
        m24753a.mo24629d(m24859s());
        m24753a.mo24625h(3);
        return m24753a.mo24632a();
    }

    /* renamed from: s */
    private AbstractC5448a0.AbstractC5458e.AbstractC5463c m24859s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m24873e = m24873e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m24983s = C5373n.m24983s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m24977y = C5373n.m24977y(this.f13338a);
        int m24989m = C5373n.m24989m(this.f13338a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a m24747a = AbstractC5448a0.AbstractC5458e.AbstractC5463c.m24747a();
        m24747a.mo24595b(m24873e);
        m24747a.mo24591f(Build.MODEL);
        m24747a.mo24594c(availableProcessors);
        m24747a.mo24589h(m24983s);
        m24747a.mo24593d(blockCount);
        m24747a.mo24588i(m24977y);
        m24747a.mo24587j(m24989m);
        m24747a.mo24592e(str);
        m24747a.mo24590g(str2);
        return m24747a.mo24596a();
    }

    /* renamed from: t */
    private AbstractC5448a0.AbstractC5458e.AbstractC5485e m24858t() {
        AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a m24734a = AbstractC5448a0.AbstractC5458e.AbstractC5485e.m24734a();
        m24734a.mo24483d(3);
        m24734a.mo24482e(Build.VERSION.RELEASE);
        m24734a.mo24485b(Build.VERSION.CODENAME);
        m24734a.mo24484c(C5373n.m24976z(this.f13338a));
        return m24734a.mo24486a();
    }

    /* renamed from: u */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d m24857u() {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a m24739a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.m24739a();
        m24739a.mo24525d("0");
        m24739a.mo24526c("0");
        m24739a.mo24527b(0L);
        return m24739a.mo24528a();
    }

    /* renamed from: v */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e m24856v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m24855w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e m24855w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a m24738a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.m24738a();
        m24738a.mo24518d(thread.getName());
        m24738a.mo24519c(i);
        m24738a.mo24520b(C5492b0.m24714d(m24862p(stackTraceElementArr, i)));
        return m24738a.mo24521a();
    }

    /* renamed from: x */
    private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> m24854x(C5603e c5603e, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m24855w(thread, c5603e.f13813c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m24856v(key, this.f13341d.mo24349a(entry.getValue())));
                }
            }
        }
        return C5492b0.m24714d(arrayList);
    }

    /* renamed from: b */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d m24876b(AbstractC5448a0.AbstractC5449a abstractC5449a) {
        int i = this.f13338a.getResources().getConfiguration().orientation;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b m24746a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.m24746a();
        m24746a.mo24575f("anr");
        m24746a.mo24576e(abstractC5449a.mo24706h());
        m24746a.mo24579b(m24870h(i, abstractC5449a));
        m24746a.mo24578c(m24868j(i));
        return m24746a.mo24580a();
    }

    /* renamed from: c */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d m24875c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f13338a.getResources().getConfiguration().orientation;
        C5603e c5603e = new C5603e(th, this.f13341d);
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b m24746a = AbstractC5448a0.AbstractC5458e.AbstractC5465d.m24746a();
        m24746a.mo24575f(str);
        m24746a.mo24576e(j);
        m24746a.mo24579b(m24869i(i3, c5603e, thread, i, i2, z));
        m24746a.mo24578c(m24868j(i3));
        return m24746a.mo24580a();
    }

    /* renamed from: d */
    public AbstractC5448a0 m24874d(String str, long j) {
        AbstractC5448a0.AbstractC5451b m24877a = m24877a();
        m24877a.mo24715i(m24860r(str, j));
        return m24877a.mo24723a();
    }
}
