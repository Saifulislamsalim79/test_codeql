package com.google.firebase.messaging.p168h1;

import h.c.a.b.d.f.s;
import p272h.p286c.p287a.p300b.p307d.p313f.InterfaceC8447q;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.h1.a */
/* loaded from: classes2.dex */
public final class C6503a {

    /* renamed from: a */
    private final long f15682a;

    /* renamed from: b */
    private final String f15683b;

    /* renamed from: c */
    private final String f15684c;

    /* renamed from: d */
    private final EnumC6506c f15685d;

    /* renamed from: e */
    private final EnumC6507d f15686e;

    /* renamed from: f */
    private final String f15687f;

    /* renamed from: g */
    private final String f15688g;

    /* renamed from: h */
    private final int f15689h;

    /* renamed from: i */
    private final int f15690i;

    /* renamed from: j */
    private final String f15691j;

    /* renamed from: k */
    private final long f15692k;

    /* renamed from: l */
    private final EnumC6505b f15693l;

    /* renamed from: m */
    private final String f15694m;

    /* renamed from: n */
    private final long f15695n;

    /* renamed from: o */
    private final String f15696o;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.h1.a$a */
    /* loaded from: classes2.dex */
    public static final class C6504a {

        /* renamed from: a */
        private long f15697a = 0;

        /* renamed from: b */
        private String f15698b = "";

        /* renamed from: c */
        private String f15699c = "";

        /* renamed from: d */
        private EnumC6506c f15700d = EnumC6506c.UNKNOWN;

        /* renamed from: e */
        private EnumC6507d f15701e = EnumC6507d.UNKNOWN_OS;

        /* renamed from: f */
        private String f15702f = "";

        /* renamed from: g */
        private String f15703g = "";

        /* renamed from: h */
        private int f15704h = 0;

        /* renamed from: i */
        private int f15705i = 0;

        /* renamed from: j */
        private String f15706j = "";

        /* renamed from: k */
        private long f15707k = 0;

        /* renamed from: l */
        private EnumC6505b f15708l = EnumC6505b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f15709m = "";

        /* renamed from: n */
        private long f15710n = 0;

        /* renamed from: o */
        private String f15711o = "";

        C6504a() {
        }

        /* renamed from: a */
        public C6503a m21765a() {
            return new C6503a(this.f15697a, this.f15698b, this.f15699c, this.f15700d, this.f15701e, this.f15702f, this.f15703g, this.f15704h, this.f15705i, this.f15706j, this.f15707k, this.f15708l, this.f15709m, this.f15710n, this.f15711o);
        }

        /* renamed from: b */
        public C6504a m21764b(String str) {
            this.f15709m = str;
            return this;
        }

        /* renamed from: c */
        public C6504a m21763c(String str) {
            this.f15703g = str;
            return this;
        }

        /* renamed from: d */
        public C6504a m21762d(String str) {
            this.f15711o = str;
            return this;
        }

        /* renamed from: e */
        public C6504a m21761e(EnumC6505b enumC6505b) {
            this.f15708l = enumC6505b;
            return this;
        }

        /* renamed from: f */
        public C6504a m21760f(String str) {
            this.f15699c = str;
            return this;
        }

        /* renamed from: g */
        public C6504a m21759g(String str) {
            this.f15698b = str;
            return this;
        }

        /* renamed from: h */
        public C6504a m21758h(EnumC6506c enumC6506c) {
            this.f15700d = enumC6506c;
            return this;
        }

        /* renamed from: i */
        public C6504a m21757i(String str) {
            this.f15702f = str;
            return this;
        }

        /* renamed from: j */
        public C6504a m21756j(long j) {
            this.f15697a = j;
            return this;
        }

        /* renamed from: k */
        public C6504a m21755k(EnumC6507d enumC6507d) {
            this.f15701e = enumC6507d;
            return this;
        }

        /* renamed from: l */
        public C6504a m21754l(String str) {
            this.f15706j = str;
            return this;
        }

        /* renamed from: m */
        public C6504a m21753m(int i) {
            this.f15705i = i;
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.h1.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC6505b implements InterfaceC8447q {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: c */
        private final int f15716c;

        EnumC6505b(int i) {
            this.f15716c = i;
        }

        @Override // p272h.p286c.p287a.p300b.p307d.p313f.InterfaceC8447q
        /* renamed from: d */
        public int mo16094d() {
            return this.f15716c;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.h1.a$c */
    /* loaded from: classes2.dex */
    public enum EnumC6506c implements InterfaceC8447q {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: c */
        private final int f15722c;

        EnumC6506c(int i) {
            this.f15722c = i;
        }

        @Override // p272h.p286c.p287a.p300b.p307d.p313f.InterfaceC8447q
        /* renamed from: d */
        public int mo16094d() {
            return this.f15722c;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.h1.a$d */
    /* loaded from: classes2.dex */
    public enum EnumC6507d implements InterfaceC8447q {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: c */
        private final int f15728c;

        EnumC6507d(int i) {
            this.f15728c = i;
        }

        @Override // p272h.p286c.p287a.p300b.p307d.p313f.InterfaceC8447q
        /* renamed from: d */
        public int mo16094d() {
            return this.f15728c;
        }
    }

    static {
        new C6504a().m21765a();
    }

    C6503a(long j, String str, String str2, EnumC6506c enumC6506c, EnumC6507d enumC6507d, String str3, String str4, int i, int i2, String str5, long j2, EnumC6505b enumC6505b, String str6, long j3, String str7) {
        this.f15682a = j;
        this.f15683b = str;
        this.f15684c = str2;
        this.f15685d = enumC6506c;
        this.f15686e = enumC6507d;
        this.f15687f = str3;
        this.f15688g = str4;
        this.f15689h = i;
        this.f15690i = i2;
        this.f15691j = str5;
        this.f15692k = j2;
        this.f15693l = enumC6505b;
        this.f15694m = str6;
        this.f15695n = j3;
        this.f15696o = str7;
    }

    /* renamed from: p */
    public static C6504a m21766p() {
        return new C6504a();
    }

    @s(zza = 13)
    /* renamed from: a */
    public String m21781a() {
        return this.f15694m;
    }

    @s(zza = 11)
    /* renamed from: b */
    public long m21780b() {
        return this.f15692k;
    }

    @s(zza = 14)
    /* renamed from: c */
    public long m21779c() {
        return this.f15695n;
    }

    @s(zza = 7)
    /* renamed from: d */
    public String m21778d() {
        return this.f15688g;
    }

    @s(zza = 15)
    /* renamed from: e */
    public String m21777e() {
        return this.f15696o;
    }

    @s(zza = 12)
    /* renamed from: f */
    public EnumC6505b m21776f() {
        return this.f15693l;
    }

    @s(zza = 3)
    /* renamed from: g */
    public String m21775g() {
        return this.f15684c;
    }

    @s(zza = 2)
    /* renamed from: h */
    public String m21774h() {
        return this.f15683b;
    }

    @s(zza = 4)
    /* renamed from: i */
    public EnumC6506c m21773i() {
        return this.f15685d;
    }

    @s(zza = 6)
    /* renamed from: j */
    public String m21772j() {
        return this.f15687f;
    }

    @s(zza = 8)
    /* renamed from: k */
    public int m21771k() {
        return this.f15689h;
    }

    @s(zza = 1)
    /* renamed from: l */
    public long m21770l() {
        return this.f15682a;
    }

    @s(zza = 5)
    /* renamed from: m */
    public EnumC6507d m21769m() {
        return this.f15686e;
    }

    @s(zza = 10)
    /* renamed from: n */
    public String m21768n() {
        return this.f15691j;
    }

    @s(zza = 9)
    /* renamed from: o */
    public int m21767o() {
        return this.f15690i;
    }
}
