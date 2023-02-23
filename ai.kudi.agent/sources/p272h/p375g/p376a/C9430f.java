package p272h.p375g.p376a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p272h.p375g.p376a.C9427c;
import p272h.p375g.p376a.p378h.AbstractC9442j;
import p272h.p375g.p376a.p378h.C9436e;
import p577n.p587c.C14460c;
import p577n.p587c.InterfaceC14459b;
/* compiled from: MessageFactory.java */
/* renamed from: h.g.a.f */
/* loaded from: classes2.dex */
public class C9430f<T extends C9427c> {

    /* renamed from: g */
    private boolean f22095g;

    /* renamed from: h */
    private boolean f22096h;

    /* renamed from: i */
    private boolean f22097i;

    /* renamed from: j */
    private boolean f22098j;

    /* renamed from: a */
    protected final InterfaceC14459b f22089a = C14460c.m1680f(C9430f.class);

    /* renamed from: b */
    private Map<Integer, T> f22090b = new HashMap();

    /* renamed from: c */
    protected Map<Integer, Map<Integer, AbstractC9442j>> f22091c = new HashMap();

    /* renamed from: d */
    protected Map<Integer, List<Integer>> f22092d = new HashMap();

    /* renamed from: e */
    private Map<Integer, String> f22093e = new HashMap();

    /* renamed from: f */
    private Map<Integer, InterfaceC9426b> f22094f = new HashMap();

    /* renamed from: k */
    private String f22099k = System.getProperty("file.encoding");

    /* renamed from: a */
    public void m14755a(T t) {
        if (t != null) {
            this.f22090b.put(Integer.valueOf(t.m14778d()), t);
        }
    }

    /* renamed from: b */
    protected T m14754b(String str) {
        return (T) new C9427c(str);
    }

    /* renamed from: c */
    public String m14753c() {
        return this.f22099k;
    }

    /* renamed from: d */
    public <F> InterfaceC9426b<F> m14752d(int i) {
        return this.f22094f.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public <F> InterfaceC9426b<F> m14751e(Integer num) {
        return this.f22094f.get(num);
    }

    /* renamed from: f */
    public String m14750f(int i) {
        return this.f22093e.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    public T m14749g(int i) {
        return this.f22090b.get(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0314 A[EDGE_INSN: B:426:0x0314->B:260:0x0314 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T m14748h(byte[] r24, int r25) throws java.text.ParseException, java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p375g.p376a.C9430f.m14748h(byte[], int):h.g.a.c");
    }

    /* renamed from: i */
    public void m14747i(boolean z) {
    }

    /* renamed from: j */
    public void m14746j(String str) {
        if (this.f22099k != null) {
            this.f22099k = str;
            if (!this.f22091c.isEmpty()) {
                for (Map<Integer, AbstractC9442j> map : this.f22091c.values()) {
                    for (AbstractC9442j abstractC9442j : map.values()) {
                        abstractC9442j.m14713g(this.f22099k);
                    }
                }
            }
            if (this.f22090b.isEmpty()) {
                return;
            }
            for (T t : this.f22090b.values()) {
                t.m14774h(this.f22099k);
                for (int i = 2; i < 129; i++) {
                    C9429e m14780b = t.m14780b(i);
                    if (m14780b != null) {
                        m14780b.m14758f(this.f22099k);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set null encoding.");
    }

    /* renamed from: k */
    public void m14745k(String str) throws IOException {
        C9436e.m14725b(this, str);
        m14746j(this.f22099k);
        m14743m(this.f22098j);
    }

    /* renamed from: l */
    public void m14744l(int i) {
    }

    /* renamed from: m */
    public void m14743m(boolean z) {
        this.f22098j = z;
        for (Map<Integer, AbstractC9442j> map : this.f22091c.values()) {
            for (AbstractC9442j abstractC9442j : map.values()) {
                abstractC9442j.m14711i(z);
            }
        }
    }

    /* renamed from: n */
    public void m14742n(boolean z) {
        this.f22096h = z;
    }

    /* renamed from: o */
    public void m14741o(int i, String str) {
        if (str == null) {
            this.f22093e.remove(Integer.valueOf(i));
        } else {
            this.f22093e.put(Integer.valueOf(i), str);
        }
    }

    /* renamed from: p */
    public void m14740p(int i, Map<Integer, AbstractC9442j> map) {
        this.f22091c.put(Integer.valueOf(i), map);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        this.f22089a.mo1638i(String.format("ISO8583 MessageFactory adding parse map for type %04x with fields %s", Integer.valueOf(i), arrayList));
        this.f22092d.put(Integer.valueOf(i), arrayList);
    }

    /* renamed from: q */
    public void m14739q(boolean z) {
        this.f22097i = z;
    }

    /* renamed from: r */
    public void m14738r(boolean z) {
        this.f22095g = z;
    }
}
