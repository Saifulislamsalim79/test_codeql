package com.google.firebase.database.p129r;

import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import com.google.firebase.database.p129r.C5680h;
import com.google.firebase.database.p129r.InterfaceC5685j;
import com.google.firebase.database.p129r.InterfaceC5690n;
import com.google.firebase.database.p129r.p130s.C5721a;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import com.google.firebase.database.p140v.C5956a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PersistentConnectionImpl.java */
/* renamed from: com.google.firebase.database.r.o */
/* loaded from: classes2.dex */
public class C5692o implements C5680h.InterfaceC5681a, InterfaceC5690n {

    /* renamed from: H */
    private static long f13974H;

    /* renamed from: A */
    private String f13975A;

    /* renamed from: F */
    private long f13980F;

    /* renamed from: G */
    private boolean f13981G;

    /* renamed from: a */
    private final InterfaceC5690n.InterfaceC5691a f13982a;

    /* renamed from: b */
    private final C5688l f13983b;

    /* renamed from: c */
    private String f13984c;

    /* renamed from: f */
    private long f13987f;

    /* renamed from: g */
    private C5680h f13988g;

    /* renamed from: q */
    private String f13998q;

    /* renamed from: r */
    private boolean f13999r;

    /* renamed from: s */
    private String f14000s;

    /* renamed from: t */
    private boolean f14001t;

    /* renamed from: u */
    private final C5684i f14002u;

    /* renamed from: v */
    private final InterfaceC5685j f14003v;

    /* renamed from: w */
    private final InterfaceC5685j f14004w;

    /* renamed from: x */
    private final ScheduledExecutorService f14005x;

    /* renamed from: y */
    private final C5899c f14006y;

    /* renamed from: z */
    private final C5721a f14007z;

    /* renamed from: d */
    private HashSet<String> f13985d = new HashSet<>();

    /* renamed from: e */
    private boolean f13986e = true;

    /* renamed from: h */
    private EnumC5703k f13989h = EnumC5703k.Disconnected;

    /* renamed from: i */
    private long f13990i = 0;

    /* renamed from: j */
    private long f13991j = 0;

    /* renamed from: k */
    private long f13992k = 0;

    /* renamed from: B */
    private long f13976B = 0;

    /* renamed from: C */
    private int f13977C = 0;

    /* renamed from: D */
    private int f13978D = 0;

    /* renamed from: E */
    private ScheduledFuture<?> f13979E = null;

    /* renamed from: p */
    private Map<C5708p, C5706n> f13997p = new HashMap();

    /* renamed from: l */
    private Map<Long, InterfaceC5702j> f13993l = new HashMap();

    /* renamed from: n */
    private Map<Long, C5707o> f13995n = new HashMap();

    /* renamed from: o */
    private Map<Long, C5705m> f13996o = new ConcurrentHashMap();

    /* renamed from: m */
    private List<C5704l> f13994m = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$a */
    /* loaded from: classes2.dex */
    public class C5693a implements InterfaceC5685j.InterfaceC5686a {

        /* renamed from: a */
        final /* synthetic */ C4465k f14008a;

        C5693a(C5692o c5692o, C4465k c4465k) {
            this.f14008a = c4465k;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5685j.InterfaceC5686a
        /* renamed from: a */
        public void mo24075a(String str) {
            this.f14008a.m27775c(str);
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5685j.InterfaceC5686a
        public void onError(String str) {
            this.f14008a.m27776b(new Exception(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$b */
    /* loaded from: classes2.dex */
    public class C5694b implements InterfaceC5685j.InterfaceC5686a {

        /* renamed from: a */
        final /* synthetic */ C4465k f14009a;

        C5694b(C5692o c5692o, C4465k c4465k) {
            this.f14009a = c4465k;
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5685j.InterfaceC5686a
        /* renamed from: a */
        public void mo24075a(String str) {
            this.f14009a.m27775c(str);
        }

        @Override // com.google.firebase.database.p129r.InterfaceC5685j.InterfaceC5686a
        public void onError(String str) {
            this.f14009a.m27776b(new Exception(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$c */
    /* loaded from: classes2.dex */
    public class C5695c implements InterfaceC5702j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5710q f14010a;

        C5695c(C5692o c5692o, InterfaceC5710q interfaceC5710q) {
            this.f14010a = interfaceC5710q;
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            String str = (String) map.get("s");
            String str2 = null;
            if (str.equals("ok")) {
                str = null;
            } else {
                str2 = (String) map.get("d");
            }
            InterfaceC5710q interfaceC5710q = this.f14010a;
            if (interfaceC5710q != null) {
                interfaceC5710q.mo23515a(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$d */
    /* loaded from: classes2.dex */
    public class C5696d implements InterfaceC5702j {

        /* renamed from: a */
        final /* synthetic */ boolean f14011a;

        C5696d(boolean z) {
            this.f14011a = z;
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (!str.equals("ok")) {
                C5692o.this.f13998q = null;
                C5692o.this.f13999r = true;
                C5692o.this.f13982a.mo23543b(false);
                C5899c c5899c = C5692o.this.f14006y;
                c5899c.m23366b("Authentication failed: " + str + " (" + ((String) map.get("d")) + ")", new Object[0]);
                C5692o.this.f13988g.m24188c();
                if (str.equals("invalid_token")) {
                    C5692o.m24091s(C5692o.this);
                    if (C5692o.this.f13977C >= 3) {
                        C5692o.this.f14007z.m24017d();
                        C5692o.this.f14006y.m23359i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                        return;
                    }
                    return;
                }
                return;
            }
            C5692o.this.f13989h = EnumC5703k.Connected;
            C5692o.this.f13977C = 0;
            C5692o.this.m24098o0(this.f14011a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$e */
    /* loaded from: classes2.dex */
    public class C5697e implements InterfaceC5702j {

        /* renamed from: a */
        final /* synthetic */ String f14013a;

        /* renamed from: b */
        final /* synthetic */ long f14014b;

        /* renamed from: c */
        final /* synthetic */ C5707o f14015c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC5710q f14016d;

        C5697e(String str, long j, C5707o c5707o, InterfaceC5710q interfaceC5710q) {
            this.f14013a = str;
            this.f14014b = j;
            this.f14015c = c5707o;
            this.f14016d = interfaceC5710q;
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            if (C5692o.this.f14006y.m23362f()) {
                C5899c c5899c = C5692o.this.f14006y;
                c5899c.m23366b(this.f14013a + " response: " + map, new Object[0]);
            }
            if (((C5707o) C5692o.this.f13995n.get(Long.valueOf(this.f14014b))) == this.f14015c) {
                C5692o.this.f13995n.remove(Long.valueOf(this.f14014b));
                if (this.f14016d != null) {
                    String str = (String) map.get("s");
                    if (str.equals("ok")) {
                        this.f14016d.mo23515a(null, null);
                    } else {
                        this.f14016d.mo23515a(str, (String) map.get("d"));
                    }
                }
            } else if (C5692o.this.f14006y.m23362f()) {
                C5899c c5899c2 = C5692o.this.f14006y;
                c5899c2.m23366b("Ignoring on complete for put " + this.f14014b + " because it was removed already.", new Object[0]);
            }
            C5692o.this.m24140N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$f */
    /* loaded from: classes2.dex */
    public class C5698f implements InterfaceC5702j {

        /* renamed from: a */
        final /* synthetic */ Long f14018a;

        /* renamed from: b */
        final /* synthetic */ C5705m f14019b;

        C5698f(Long l, C5705m c5705m) {
            this.f14018a = l;
            this.f14019b = c5705m;
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            if (((C5705m) C5692o.this.f13996o.get(this.f14018a)) == this.f14019b) {
                C5692o.this.f13996o.remove(this.f14018a);
                this.f14019b.m24066d().mo24074a(map);
            } else if (C5692o.this.f14006y.m23362f()) {
                C5899c c5899c = C5692o.this.f14006y;
                c5899c.m23366b("Ignoring on complete for get " + this.f14018a + " because it was removed already.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$g */
    /* loaded from: classes2.dex */
    public class C5699g implements InterfaceC5702j {

        /* renamed from: a */
        final /* synthetic */ C5706n f14021a;

        C5699g(C5706n c5706n) {
            this.f14021a = c5706n;
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                Map map2 = (Map) map.get("d");
                if (map2.containsKey("w")) {
                    C5692o.this.m24148F0((List) map2.get("w"), this.f14021a.f14039b);
                }
            }
            if (((C5706n) C5692o.this.f13997p.get(this.f14021a.m24060d())) == this.f14021a) {
                if (!str.equals("ok")) {
                    C5692o.this.m24108j0(this.f14021a.m24060d());
                    this.f14021a.f14038a.mo23515a(str, (String) map.get("d"));
                    return;
                }
                this.f14021a.f14038a.mo23515a(null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$h */
    /* loaded from: classes2.dex */
    public class C5700h implements InterfaceC5702j {
        C5700h() {
        }

        @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
        /* renamed from: a */
        public void mo24074a(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                return;
            }
            String str2 = (String) map.get("d");
            if (C5692o.this.f14006y.m23362f()) {
                C5899c c5899c = C5692o.this.f14006y;
                c5899c.m23366b("Failed to send stats: " + str + " (message: " + str2 + ")", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$i */
    /* loaded from: classes2.dex */
    public class RunnableC5701i implements Runnable {
        RunnableC5701i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5692o.this.f13979E = null;
            if (!C5692o.this.m24135S()) {
                C5692o.this.m24140N();
            } else {
                C5692o.this.mo24121d("connection_idle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC5702j {
        /* renamed from: a */
        void mo24074a(Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$k */
    /* loaded from: classes2.dex */
    public enum EnumC5703k {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$l */
    /* loaded from: classes2.dex */
    public static class C5704l {

        /* renamed from: a */
        private final String f14031a;

        /* renamed from: b */
        private final List<String> f14032b;

        /* renamed from: c */
        private final Object f14033c;

        /* renamed from: d */
        private final InterfaceC5710q f14034d;

        /* renamed from: a */
        public String m24073a() {
            return this.f14031a;
        }

        /* renamed from: b */
        public Object m24072b() {
            return this.f14033c;
        }

        /* renamed from: c */
        public InterfaceC5710q m24071c() {
            return this.f14034d;
        }

        /* renamed from: d */
        public List<String> m24070d() {
            return this.f14032b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$m */
    /* loaded from: classes2.dex */
    public static class C5705m {

        /* renamed from: a */
        private final Map<String, Object> f14035a;

        /* renamed from: b */
        private final InterfaceC5702j f14036b;

        /* renamed from: c */
        private boolean f14037c;

        /* synthetic */ C5705m(String str, Map map, InterfaceC5702j interfaceC5702j, C5693a c5693a) {
            this(str, map, interfaceC5702j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public InterfaceC5702j m24066d() {
            return this.f14036b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public Map<String, Object> m24065e() {
            return this.f14035a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public boolean m24064f() {
            if (this.f14037c) {
                return false;
            }
            this.f14037c = true;
            return true;
        }

        private C5705m(String str, Map<String, Object> map, InterfaceC5702j interfaceC5702j) {
            this.f14035a = map;
            this.f14036b = interfaceC5702j;
            this.f14037c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$n */
    /* loaded from: classes2.dex */
    public static class C5706n {

        /* renamed from: a */
        private final InterfaceC5710q f14038a;

        /* renamed from: b */
        private final C5708p f14039b;

        /* renamed from: c */
        private final InterfaceC5689m f14040c;

        /* renamed from: d */
        private final Long f14041d;

        /* synthetic */ C5706n(InterfaceC5710q interfaceC5710q, C5708p c5708p, Long l, InterfaceC5689m interfaceC5689m, C5693a c5693a) {
            this(interfaceC5710q, c5708p, l, interfaceC5689m);
        }

        /* renamed from: c */
        public InterfaceC5689m m24061c() {
            return this.f14040c;
        }

        /* renamed from: d */
        public C5708p m24060d() {
            return this.f14039b;
        }

        /* renamed from: e */
        public Long m24059e() {
            return this.f14041d;
        }

        public String toString() {
            return this.f14039b.toString() + " (Tag: " + this.f14041d + ")";
        }

        private C5706n(InterfaceC5710q interfaceC5710q, C5708p c5708p, Long l, InterfaceC5689m interfaceC5689m) {
            this.f14038a = interfaceC5710q;
            this.f14039b = c5708p;
            this.f14040c = interfaceC5689m;
            this.f14041d = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$o */
    /* loaded from: classes2.dex */
    public static class C5707o {

        /* renamed from: a */
        private String f14042a;

        /* renamed from: b */
        private Map<String, Object> f14043b;

        /* renamed from: c */
        private InterfaceC5710q f14044c;

        /* renamed from: d */
        private boolean f14045d;

        /* synthetic */ C5707o(String str, Map map, InterfaceC5710q interfaceC5710q, C5693a c5693a) {
            this(str, map, interfaceC5710q);
        }

        /* renamed from: a */
        public String m24058a() {
            return this.f14042a;
        }

        /* renamed from: b */
        public InterfaceC5710q m24057b() {
            return this.f14044c;
        }

        /* renamed from: c */
        public Map<String, Object> m24056c() {
            return this.f14043b;
        }

        /* renamed from: d */
        public void m24055d() {
            this.f14045d = true;
        }

        /* renamed from: e */
        public boolean m24054e() {
            return this.f14045d;
        }

        private C5707o(String str, Map<String, Object> map, InterfaceC5710q interfaceC5710q) {
            this.f14042a = str;
            this.f14043b = map;
            this.f14044c = interfaceC5710q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PersistentConnectionImpl.java */
    /* renamed from: com.google.firebase.database.r.o$p */
    /* loaded from: classes2.dex */
    public static class C5708p {

        /* renamed from: a */
        private final List<String> f14046a;

        /* renamed from: b */
        private final Map<String, Object> f14047b;

        public C5708p(List<String> list, Map<String, Object> map) {
            this.f14046a = list;
            this.f14047b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5708p) {
                C5708p c5708p = (C5708p) obj;
                if (this.f14046a.equals(c5708p.f14046a)) {
                    return this.f14047b.equals(c5708p.f14047b);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (this.f14046a.hashCode() * 31) + this.f14047b.hashCode();
        }

        public String toString() {
            return C5687k.m24165d(this.f14046a) + " (params: " + this.f14047b + ")";
        }
    }

    public C5692o(C5684i c5684i, C5688l c5688l, InterfaceC5690n.InterfaceC5691a interfaceC5691a) {
        this.f13982a = interfaceC5691a;
        this.f14002u = c5684i;
        this.f14005x = c5684i.m24173e();
        this.f14003v = c5684i.m24175c();
        this.f14004w = c5684i.m24177a();
        this.f13983b = c5688l;
        C5721a.C5723b c5723b = new C5721a.C5723b(this.f14005x, c5684i.m24172f(), "ConnectionRetryHelper");
        c5723b.m24012d(1000L);
        c5723b.m24011e(1.3d);
        c5723b.m24013c(30000L);
        c5723b.m24014b(0.7d);
        this.f14007z = c5723b.m24015a();
        long j = f13974H;
        f13974H = 1 + j;
        InterfaceC5900d m24172f = c5684i.m24172f();
        this.f14006y = new C5899c(m24172f, "PersistentConnection", "pc_" + j);
        this.f13975A = null;
        m24140N();
    }

    /* renamed from: A0 */
    private void m24158A0(C5706n c5706n) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C5687k.m24165d(c5706n.f14039b.f14046a));
        Long m24059e = c5706n.m24059e();
        if (m24059e != null) {
            hashMap.put("q", c5706n.m24060d().f14047b);
            hashMap.put("t", m24059e);
        }
        m24100n0("n", hashMap, null);
    }

    /* renamed from: C0 */
    private void m24154C0() {
        if (m24156B0()) {
            C5687k.m24167b(this.f13989h == EnumC5703k.Disconnected, "Not in disconnected state: %s", this.f13989h);
            final boolean z = this.f13999r;
            final boolean z2 = this.f14001t;
            this.f14006y.m23366b("Scheduling connection attempt", new Object[0]);
            this.f13999r = false;
            this.f14001t = false;
            this.f14007z.m24018c(new Runnable() { // from class: com.google.firebase.database.r.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5692o.this.m24126a0(z, z2);
                }
            });
        }
    }

    /* renamed from: D0 */
    private void m24152D0() {
        m24098o0(false);
    }

    /* renamed from: E0 */
    private void m24150E0() {
        m24094q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m24148F0(List<String> list, C5708p c5708p) {
        if (list.contains("no_index")) {
            C5899c c5899c = this.f14006y;
            c5899c.m23359i("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + ("\".indexOn\": \"" + c5708p.f14047b.get("i") + '\"') + "' at " + C5687k.m24165d(c5708p.f14046a) + " to your security and Firebase Database rules for better performance");
        }
    }

    /* renamed from: J */
    private boolean m24144J() {
        return this.f13989h == EnumC5703k.Connected;
    }

    /* renamed from: K */
    private boolean m24143K() {
        return this.f13989h == EnumC5703k.Connected;
    }

    /* renamed from: L */
    private void m24142L() {
        ArrayList<C5707o> arrayList = new ArrayList();
        Iterator<Map.Entry<Long, C5707o>> it = this.f13995n.entrySet().iterator();
        while (it.hasNext()) {
            C5707o value = it.next().getValue();
            if (value.m24056c().containsKey("h") && value.m24054e()) {
                arrayList.add(value);
                it.remove();
            }
        }
        for (C5707o c5707o : arrayList) {
            c5707o.m24057b().mo23515a("disconnected", null);
        }
    }

    /* renamed from: M */
    private boolean m24141M() {
        EnumC5703k enumC5703k = this.f13989h;
        return enumC5703k == EnumC5703k.Authenticating || enumC5703k == EnumC5703k.Connected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m24140N() {
        if (m24134T()) {
            ScheduledFuture<?> scheduledFuture = this.f13979E;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f13979E = this.f14005x.schedule(new RunnableC5701i(), 60000L, TimeUnit.MILLISECONDS);
        } else if (m24133U("connection_idle")) {
            C5687k.m24168a(!m24134T());
            mo24117f("connection_idle");
        }
    }

    /* renamed from: O */
    private j<String> m24139O(boolean z) {
        C4465k c4465k = new C4465k();
        this.f14006y.m23366b("Trying to fetch app check token", new Object[0]);
        this.f14004w.mo23996a(z, new C5694b(this, c4465k));
        return c4465k.m27777a();
    }

    /* renamed from: P */
    private j<String> m24138P(boolean z) {
        C4465k c4465k = new C4465k();
        this.f14006y.m23366b("Trying to fetch auth token", new Object[0]);
        this.f14003v.mo23996a(z, new C5693a(this, c4465k));
        return c4465k.m27777a();
    }

    /* renamed from: Q */
    private Map<String, Object> m24137Q(List<String> list, Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C5687k.m24165d(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    /* renamed from: R */
    private void m24136R(long j) {
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.f13982a.mo23541c(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public boolean m24135S() {
        return m24134T() && System.currentTimeMillis() > this.f13980F + 60000;
    }

    /* renamed from: T */
    private boolean m24134T() {
        return this.f13997p.isEmpty() && this.f13996o.isEmpty() && this.f13993l.isEmpty() && !this.f13981G && this.f13995n.isEmpty();
    }

    /* renamed from: b0 */
    private long m24124b0() {
        long j = this.f13992k;
        this.f13992k = 1 + j;
        return j;
    }

    /* renamed from: c0 */
    private void m24122c0(String str, String str2) {
        C5899c c5899c = this.f14006y;
        c5899c.m23366b("App check token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f14000s = null;
        this.f14001t = true;
    }

    /* renamed from: d0 */
    private void m24120d0(String str, String str2) {
        C5899c c5899c = this.f14006y;
        c5899c.m23366b("Auth token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f13998q = null;
        this.f13999r = true;
        this.f13982a.mo23543b(false);
        this.f13988g.m24188c();
    }

    /* renamed from: e0 */
    private void m24118e0(String str, Map<String, Object> map) {
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("handleServerMessage: " + str + " " + map, new Object[0]);
        }
        if (!str.equals("d") && !str.equals("m")) {
            if (str.equals("rm")) {
                String str2 = (String) map.get("p");
                List<String> m24164e = C5687k.m24164e(str2);
                Object obj = map.get("d");
                Long m24166c = C5687k.m24166c(map.get("t"));
                ArrayList arrayList = new ArrayList();
                for (Map map2 : (List) obj) {
                    String str3 = (String) map2.get("s");
                    String str4 = (String) map2.get("e");
                    List<String> list = null;
                    List<String> m24164e2 = str3 != null ? C5687k.m24164e(str3) : null;
                    if (str4 != null) {
                        list = C5687k.m24164e(str4);
                    }
                    arrayList.add(new C5709p(m24164e2, list, map2.get("m")));
                }
                if (arrayList.isEmpty()) {
                    if (this.f14006y.m23362f()) {
                        C5899c c5899c2 = this.f14006y;
                        c5899c2.m23366b("Ignoring empty range merge for path " + str2, new Object[0]);
                        return;
                    }
                    return;
                }
                this.f13982a.mo23540d(m24164e, arrayList, m24166c);
                return;
            } else if (str.equals("c")) {
                m24116f0(C5687k.m24164e((String) map.get("p")));
                return;
            } else if (str.equals("ac")) {
                m24120d0((String) map.get("s"), (String) map.get("d"));
                return;
            } else if (str.equals("apc")) {
                m24122c0((String) map.get("s"), (String) map.get("d"));
                return;
            } else if (str.equals("sd")) {
                m24114g0(map);
                return;
            } else if (this.f14006y.m23362f()) {
                C5899c c5899c3 = this.f14006y;
                c5899c3.m23366b("Unrecognized action from server: " + str, new Object[0]);
                return;
            } else {
                return;
            }
        }
        boolean equals = str.equals("m");
        String str5 = (String) map.get("p");
        Object obj2 = map.get("d");
        Long m24166c2 = C5687k.m24166c(map.get("t"));
        if (equals && (obj2 instanceof Map) && ((Map) obj2).size() == 0) {
            if (this.f14006y.m23362f()) {
                C5899c c5899c4 = this.f14006y;
                c5899c4.m23366b("ignoring empty merge for path " + str5, new Object[0]);
                return;
            }
            return;
        }
        this.f13982a.mo23545a(C5687k.m24164e(str5), obj2, equals, m24166c2);
    }

    /* renamed from: f0 */
    private void m24116f0(List<String> list) {
        Collection<C5706n> m24106k0 = m24106k0(list);
        if (m24106k0 != null) {
            for (C5706n c5706n : m24106k0) {
                c5706n.f14038a.mo23515a("permission_denied", null);
            }
        }
    }

    /* renamed from: g0 */
    private void m24114g0(Map<String, Object> map) {
        this.f14006y.m23363e((String) map.get("msg"));
    }

    /* renamed from: i0 */
    private void m24110i0(String str, List<String> list, Object obj, String str2, InterfaceC5710q interfaceC5710q) {
        Map<String, Object> m24137Q = m24137Q(list, obj, str2);
        long j = this.f13990i;
        this.f13990i = 1 + j;
        this.f13995n.put(Long.valueOf(j), new C5707o(str, m24137Q, interfaceC5710q, null));
        if (m24143K()) {
            m24084v0(j);
        }
        this.f13980F = System.currentTimeMillis();
        m24140N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public C5706n m24108j0(C5708p c5708p) {
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("removing query " + c5708p, new Object[0]);
        }
        if (!this.f13997p.containsKey(c5708p)) {
            if (this.f14006y.m23362f()) {
                C5899c c5899c2 = this.f14006y;
                c5899c2.m23366b("Trying to remove listener for QuerySpec " + c5708p + " but no listener exists.", new Object[0]);
                return null;
            }
            return null;
        }
        C5706n c5706n = this.f13997p.get(c5708p);
        this.f13997p.remove(c5708p);
        m24140N();
        return c5706n;
    }

    /* renamed from: k0 */
    private Collection<C5706n> m24106k0(List<String> list) {
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("removing all listens at path " + list, new Object[0]);
        }
        ArrayList<C5706n> arrayList = new ArrayList();
        for (Map.Entry<C5708p, C5706n> entry : this.f13997p.entrySet()) {
            C5706n value = entry.getValue();
            if (entry.getKey().f14046a.equals(list)) {
                arrayList.add(value);
            }
        }
        for (C5706n c5706n : arrayList) {
            this.f13997p.remove(c5706n.m24060d());
        }
        m24140N();
        return arrayList;
    }

    /* renamed from: l0 */
    private void m24104l0() {
        C5687k.m24167b(this.f13989h == EnumC5703k.Connected, "Should be connected if we're restoring state, but we are: %s", this.f13989h);
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Restoring outstanding listens", new Object[0]);
        }
        for (C5706n c5706n : this.f13997p.values()) {
            if (this.f14006y.m23362f()) {
                C5899c c5899c = this.f14006y;
                c5899c.m23366b("Restoring listen " + c5706n.m24060d(), new Object[0]);
            }
            m24088t0(c5706n);
        }
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f13995n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m24084v0(((Long) it.next()).longValue());
        }
        for (C5704l c5704l : this.f13994m) {
            m24086u0(c5704l.m24073a(), c5704l.m24070d(), c5704l.m24072b(), c5704l.m24071c());
        }
        this.f13994m.clear();
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Restoring reads.", new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList(this.f13996o.keySet());
        Collections.sort(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            m24090s0((Long) it2.next());
        }
    }

    /* renamed from: m0 */
    private void m24102m0() {
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("calling restore tokens", new Object[0]);
        }
        C5687k.m24167b(this.f13989h == EnumC5703k.Connecting, "Wanted to restore tokens, but was in wrong state: %s", this.f13989h);
        if (this.f13998q != null) {
            if (this.f14006y.m23362f()) {
                this.f14006y.m23366b("Restoring auth.", new Object[0]);
            }
            this.f13989h = EnumC5703k.Authenticating;
            m24096p0();
            return;
        }
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.f13989h = EnumC5703k.Connected;
        m24098o0(true);
    }

    /* renamed from: n0 */
    private void m24100n0(String str, Map<String, Object> map, InterfaceC5702j interfaceC5702j) {
        m24082w0(str, false, map, interfaceC5702j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m24098o0(final boolean z) {
        if (this.f14000s == null) {
            m24104l0();
            return;
        }
        C5687k.m24167b(m24141M(), "Must be connected to send auth, but was: %s", this.f13989h);
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Sending app check.", new Object[0]);
        }
        InterfaceC5702j interfaceC5702j = new InterfaceC5702j() { // from class: com.google.firebase.database.r.e
            @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
            /* renamed from: a */
            public final void mo24074a(Map map) {
                C5692o.this.m24130X(z, map);
            }
        };
        HashMap hashMap = new HashMap();
        C5687k.m24167b(this.f14000s != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f14000s);
        m24082w0("appcheck", true, hashMap, interfaceC5702j);
    }

    /* renamed from: p0 */
    private void m24096p0() {
        m24094q0(true);
    }

    /* renamed from: q0 */
    private void m24094q0(boolean z) {
        C5687k.m24167b(m24141M(), "Must be connected to send auth, but was: %s", this.f13989h);
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Sending auth.", new Object[0]);
        }
        C5696d c5696d = new C5696d(z);
        HashMap hashMap = new HashMap();
        C5956a m23181c = C5956a.m23181c(this.f13998q);
        if (m23181c != null) {
            hashMap.put("cred", m23181c.m23182b());
            if (m23181c.m23183a() != null) {
                hashMap.put("authvar", m23181c.m23183a());
            }
            m24082w0("gauth", true, hashMap, c5696d);
            return;
        }
        hashMap.put("cred", this.f13998q);
        m24082w0("auth", true, hashMap, c5696d);
    }

    /* renamed from: r0 */
    private void m24092r0() {
        HashMap hashMap = new HashMap();
        if (this.f14002u.m24169i()) {
            hashMap.put("persistence.android.enabled", 1);
        }
        hashMap.put("sdk.android." + this.f14002u.m24174d().replace('.', '-'), 1);
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Sending first connection stats", new Object[0]);
        }
        m24080x0(hashMap);
    }

    /* renamed from: s */
    static /* synthetic */ int m24091s(C5692o c5692o) {
        int i = c5692o.f13977C;
        c5692o.f13977C = i + 1;
        return i;
    }

    /* renamed from: s0 */
    private void m24090s0(Long l) {
        C5687k.m24167b(m24144J(), "sendGet called when we can't send gets", new Object[0]);
        C5705m c5705m = this.f13996o.get(l);
        if (!c5705m.m24064f() && this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("get" + l + " cancelled, ignoring.", new Object[0]);
            return;
        }
        m24100n0("g", c5705m.m24065e(), new C5698f(l, c5705m));
    }

    /* renamed from: t0 */
    private void m24088t0(C5706n c5706n) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("p", C5687k.m24165d(c5706n.m24060d().f14046a));
        Object m24059e = c5706n.m24059e();
        if (m24059e != null) {
            hashMap.put("q", c5706n.f14039b.f14047b);
            hashMap.put("t", m24059e);
        }
        InterfaceC5689m m24061c = c5706n.m24061c();
        hashMap.put("h", m24061c.mo23391d());
        if (m24061c.mo23392c()) {
            C5679g mo23393b = m24061c.mo23393b();
            ArrayList arrayList = new ArrayList();
            for (List<String> list : mo23393b.m24189b()) {
                arrayList.add(C5687k.m24165d(list));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", mo23393b.m24190a());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        m24100n0("q", hashMap, new C5699g(c5706n));
    }

    /* renamed from: u0 */
    private void m24086u0(String str, List<String> list, Object obj, InterfaceC5710q interfaceC5710q) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C5687k.m24165d(list));
        hashMap.put("d", obj);
        m24100n0(str, hashMap, new C5695c(this, interfaceC5710q));
    }

    /* renamed from: v0 */
    private void m24084v0(long j) {
        C5687k.m24167b(m24143K(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        C5707o c5707o = this.f13995n.get(Long.valueOf(j));
        InterfaceC5710q m24057b = c5707o.m24057b();
        String m24058a = c5707o.m24058a();
        c5707o.m24055d();
        m24100n0(m24058a, c5707o.m24056c(), new C5697e(m24058a, j, c5707o, m24057b));
    }

    /* renamed from: w0 */
    private void m24082w0(String str, boolean z, Map<String, Object> map, InterfaceC5702j interfaceC5702j) {
        long m24124b0 = m24124b0();
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(m24124b0));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.f13988g.m24178m(hashMap, z);
        this.f13993l.put(Long.valueOf(m24124b0), interfaceC5702j);
    }

    /* renamed from: x0 */
    private void m24080x0(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("c", map);
            m24100n0("s", hashMap, new C5700h());
        } else if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("Not sending stats because stats are empty", new Object[0]);
        }
    }

    /* renamed from: y0 */
    private void m24078y0() {
        C5687k.m24167b(m24141M(), "Must be connected to send unauth.", new Object[0]);
        C5687k.m24167b(this.f14000s == null, "App check token must not be set.", new Object[0]);
        m24100n0("unappcheck", Collections.emptyMap(), null);
    }

    /* renamed from: z0 */
    private void m24076z0() {
        C5687k.m24167b(m24141M(), "Must be connected to send unauth.", new Object[0]);
        C5687k.m24167b(this.f13998q == null, "Auth token must not be set.", new Object[0]);
        m24100n0("unauth", Collections.emptyMap(), null);
    }

    /* renamed from: B0 */
    boolean m24156B0() {
        return this.f13985d.size() == 0;
    }

    /* renamed from: U */
    public boolean m24133U(String str) {
        return this.f13985d.contains(str);
    }

    /* renamed from: V */
    public /* synthetic */ void m24132V(C5708p c5708p, C4465k c4465k, Map map) {
        if (((String) map.get("s")).equals("ok")) {
            Object obj = map.get("d");
            this.f13982a.mo23545a(c5708p.f14046a, obj, false, null);
            c4465k.m27775c(obj);
            return;
        }
        c4465k.m27776b(new Exception((String) map.get("d")));
    }

    /* renamed from: W */
    public /* synthetic */ void m24131W(C5705m c5705m, long j, C4465k c4465k) {
        if (c5705m.m24064f()) {
            if (this.f14006y.m23362f()) {
                C5899c c5899c = this.f14006y;
                c5899c.m23366b("get " + j + " timed out waiting for connection", new Object[0]);
            }
            this.f13996o.remove(Long.valueOf(j));
            c4465k.m27776b(new Exception("Client is offline"));
        }
    }

    /* renamed from: X */
    public /* synthetic */ void m24130X(boolean z, Map map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            this.f13978D = 0;
        } else {
            this.f14000s = null;
            this.f14001t = true;
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("App check failed: " + str + " (" + ((String) map.get("d")) + ")", new Object[0]);
        }
        if (z) {
            m24104l0();
        }
    }

    /* renamed from: Y */
    public /* synthetic */ void m24129Y(long j, j jVar, j jVar2, Void r9) {
        EnumC5703k enumC5703k = this.f13989h;
        if (enumC5703k == EnumC5703k.GettingToken) {
            if (j == this.f13976B) {
                this.f14006y.m23366b("Successfully fetched token, opening connection", new Object[0]);
                m24112h0((String) jVar.l(), (String) jVar2.l());
                return;
            }
            C5687k.m24167b(enumC5703k == EnumC5703k.Disconnected, "Expected connection state disconnected, but was %s", this.f13989h);
            this.f14006y.m23366b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
            return;
        }
        this.f14006y.m23366b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
    }

    /* renamed from: Z */
    public /* synthetic */ void m24128Z(long j, Exception exc) {
        if (j == this.f13976B) {
            this.f13989h = EnumC5703k.Disconnected;
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("Error fetching token: " + exc, new Object[0]);
            m24154C0();
            return;
        }
        this.f14006y.m23366b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: a */
    public void mo24127a() {
        m24154C0();
    }

    /* renamed from: a0 */
    public /* synthetic */ void m24126a0(boolean z, boolean z2) {
        C5687k.m24167b(this.f13989h == EnumC5703k.Disconnected, "Not in disconnected state: %s", this.f13989h);
        this.f13989h = EnumC5703k.GettingToken;
        final long j = this.f13976B + 1;
        this.f13976B = j;
        final j<String> m24138P = m24138P(z);
        final j<String> m24139O = m24139O(z2);
        j<Void> m27763h = C4469m.m27763h(m24138P, m24139O);
        m27763h.g(this.f14005x, new InterfaceC4458g() { // from class: com.google.firebase.database.r.d
            @Override // com.google.android.gms.tasks.InterfaceC4458g
            /* renamed from: c */
            public final void mo18742c(Object obj) {
                C5692o.this.m24129Y(j, m24138P, m24139O, (Void) obj);
            }
        });
        m27763h.e(this.f14005x, new InterfaceC4456f() { // from class: com.google.firebase.database.r.f
            @Override // com.google.android.gms.tasks.InterfaceC4456f
            /* renamed from: b */
            public final void mo15657b(Exception exc) {
                C5692o.this.m24128Z(j, exc);
            }
        });
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: b */
    public j<Object> mo24125b(List<String> list, Map<String, Object> map) {
        final C5708p c5708p = new C5708p(list, map);
        final C4465k c4465k = new C4465k();
        final long j = this.f13991j;
        this.f13991j = 1 + j;
        HashMap hashMap = new HashMap();
        hashMap.put("p", C5687k.m24165d(c5708p.f14046a));
        hashMap.put("q", c5708p.f14047b);
        final C5705m c5705m = new C5705m("g", hashMap, new InterfaceC5702j() { // from class: com.google.firebase.database.r.b
            @Override // com.google.firebase.database.p129r.C5692o.InterfaceC5702j
            /* renamed from: a */
            public final void mo24074a(Map map2) {
                C5692o.this.m24132V(c5708p, c4465k, map2);
            }
        }, null);
        this.f13996o.put(Long.valueOf(j), c5705m);
        if (!m24141M()) {
            this.f14005x.schedule(new Runnable() { // from class: com.google.firebase.database.r.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5692o.this.m24131W(c5705m, j, c4465k);
                }
            }, 3000L, TimeUnit.MILLISECONDS);
        }
        if (m24144J()) {
            m24090s0(Long.valueOf(j));
        }
        m24140N();
        return c4465k.m27777a();
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: c */
    public void mo24123c(List<String> list, Map<String, Object> map, InterfaceC5710q interfaceC5710q) {
        m24110i0("m", list, map, null, interfaceC5710q);
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: d */
    public void mo24121d(String str) {
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("Connection interrupted for: " + str, new Object[0]);
        }
        this.f13985d.add(str);
        C5680h c5680h = this.f13988g;
        if (c5680h != null) {
            c5680h.m24188c();
            this.f13988g = null;
        } else {
            this.f14007z.m24019b();
            this.f13989h = EnumC5703k.Disconnected;
        }
        this.f14007z.m24016e();
    }

    @Override // com.google.firebase.database.p129r.C5680h.InterfaceC5681a
    /* renamed from: e */
    public void mo24119e(String str) {
        this.f13984c = str;
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: f */
    public void mo24117f(String str) {
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("Connection no longer interrupted for: " + str, new Object[0]);
        }
        this.f13985d.remove(str);
        if (m24156B0() && this.f13989h == EnumC5703k.Disconnected) {
            m24154C0();
        }
    }

    @Override // com.google.firebase.database.p129r.C5680h.InterfaceC5681a
    /* renamed from: g */
    public void mo24115g(String str) {
        if (str.equals("Invalid appcheck token")) {
            int i = this.f13978D;
            if (i < 3) {
                this.f13978D = i + 1;
                C5899c c5899c = this.f14006y;
                c5899c.m23359i("Detected invalid AppCheck token. Reconnecting (" + (3 - this.f13978D) + " attempts remaining)");
                return;
            }
        }
        C5899c c5899c2 = this.f14006y;
        c5899c2.m23359i("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: " + str);
        mo24121d("server_kill");
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: h */
    public void mo24113h(List<String> list, Object obj, InterfaceC5710q interfaceC5710q) {
        m24110i0("p", list, obj, null, interfaceC5710q);
    }

    /* renamed from: h0 */
    public void m24112h0(String str, String str2) {
        C5687k.m24167b(this.f13989h == EnumC5703k.GettingToken, "Trying to open network connection while in the wrong state: %s", this.f13989h);
        if (str == null) {
            this.f13982a.mo23543b(false);
        }
        this.f13998q = str;
        this.f14000s = str2;
        this.f13989h = EnumC5703k.Connecting;
        C5680h c5680h = new C5680h(this.f14002u, this.f13983b, this.f13984c, this, this.f13975A, str2);
        this.f13988g = c5680h;
        c5680h.m24180k();
    }

    @Override // com.google.firebase.database.p129r.C5680h.InterfaceC5681a
    /* renamed from: i */
    public void mo24111i(long j, String str) {
        if (this.f14006y.m23362f()) {
            this.f14006y.m23366b("onReady", new Object[0]);
        }
        this.f13987f = System.currentTimeMillis();
        m24136R(j);
        if (this.f13986e) {
            m24092r0();
        }
        m24102m0();
        this.f13986e = false;
        this.f13975A = str;
        this.f13982a.onConnect();
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: j */
    public void mo24109j(List<String> list, Object obj, String str, InterfaceC5710q interfaceC5710q) {
        m24110i0("p", list, obj, str, interfaceC5710q);
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: k */
    public void mo24107k(String str) {
        this.f14006y.m23366b("Auth token refreshed.", new Object[0]);
        this.f13998q = str;
        if (m24141M()) {
            if (str != null) {
                m24150E0();
            } else {
                m24076z0();
            }
        }
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: l */
    public void mo24105l(List<String> list, Map<String, Object> map, InterfaceC5689m interfaceC5689m, Long l, InterfaceC5710q interfaceC5710q) {
        C5708p c5708p = new C5708p(list, map);
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("Listening on " + c5708p, new Object[0]);
        }
        C5687k.m24167b(!this.f13997p.containsKey(c5708p), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f14006y.m23362f()) {
            C5899c c5899c2 = this.f14006y;
            c5899c2.m23366b("Adding listen query: " + c5708p, new Object[0]);
        }
        C5706n c5706n = new C5706n(interfaceC5710q, c5708p, l, interfaceC5689m, null);
        this.f13997p.put(c5708p, c5706n);
        if (m24141M()) {
            m24088t0(c5706n);
        }
        m24140N();
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: m */
    public void mo24103m(String str) {
        this.f14006y.m23366b("App check token refreshed.", new Object[0]);
        this.f14000s = str;
        if (m24141M()) {
            if (str != null) {
                m24152D0();
            } else {
                m24078y0();
            }
        }
    }

    @Override // com.google.firebase.database.p129r.C5680h.InterfaceC5681a
    /* renamed from: n */
    public void mo24101n(Map<String, Object> map) {
        if (map.containsKey("r")) {
            InterfaceC5702j remove = this.f13993l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (remove != null) {
                remove.mo24074a((Map) map.get("b"));
            }
        } else if (map.containsKey(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR)) {
        } else {
            if (map.containsKey("a")) {
                m24118e0((String) map.get("a"), (Map) map.get("b"));
            } else if (this.f14006y.m23362f()) {
                C5899c c5899c = this.f14006y;
                c5899c.m23366b("Ignoring unknown message: " + map, new Object[0]);
            }
        }
    }

    @Override // com.google.firebase.database.p129r.InterfaceC5690n
    /* renamed from: o */
    public void mo24099o(List<String> list, Map<String, Object> map) {
        C5708p c5708p = new C5708p(list, map);
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("unlistening on " + c5708p, new Object[0]);
        }
        C5706n m24108j0 = m24108j0(c5708p);
        if (m24108j0 != null && m24141M()) {
            m24158A0(m24108j0);
        }
        m24140N();
    }

    @Override // com.google.firebase.database.p129r.C5680h.InterfaceC5681a
    /* renamed from: p */
    public void mo24097p(C5680h.EnumC5682b enumC5682b) {
        boolean z = false;
        if (this.f14006y.m23362f()) {
            C5899c c5899c = this.f14006y;
            c5899c.m23366b("Got on disconnect due to " + enumC5682b.name(), new Object[0]);
        }
        this.f13989h = EnumC5703k.Disconnected;
        this.f13988g = null;
        this.f13981G = false;
        this.f13993l.clear();
        m24142L();
        if (m24156B0()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f13987f;
            long j2 = currentTimeMillis - j;
            if (j > 0 && j2 > 30000) {
                z = true;
            }
            if (enumC5682b == C5680h.EnumC5682b.SERVER_RESET || z) {
                this.f14007z.m24016e();
            }
            m24154C0();
        }
        this.f13987f = 0L;
        this.f13982a.onDisconnect();
    }
}
