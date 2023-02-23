package com.google.android.gms.internal.measurement;

import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* loaded from: classes2.dex */
public final class C3937p4 extends AbstractC3894m8<C3937p4, C3922o4> implements InterfaceC3942p9 {
    public static final /* synthetic */ int zza = 0;
    private static final C3937p4 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private C4000t4 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private C3875l4 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private InterfaceC3988s8<C3779f4> zzi = AbstractC3894m8.m29393k();
    private InterfaceC3988s8<C4096z4> zzj = AbstractC3894m8.m29393k();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private InterfaceC3988s8<C3718b4> zzH = AbstractC3894m8.m29393k();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private InterfaceC3956q8 zzU = AbstractC3894m8.m29385s();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";

    static {
        C3937p4 c3937p4 = new C3937p4();
        zze = c3937p4;
        AbstractC3894m8.m29389o(C3937p4.class, c3937p4);
    }

    private C3937p4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public static /* synthetic */ void m29219A0(C3937p4 c3937p4, Iterable iterable) {
        c3937p4.m29157a1();
        AbstractC3704a7.m29846h(iterable, c3937p4.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public static /* synthetic */ void m29213C0(C3937p4 c3937p4, int i) {
        c3937p4.m29157a1();
        c3937p4.zzi.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public static /* synthetic */ void m29210D0(C3937p4 c3937p4, int i, C4096z4 c4096z4) {
        c4096z4.getClass();
        c3937p4.m29155b1();
        c3937p4.zzj.set(i, c4096z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public static /* synthetic */ void m29207E0(C3937p4 c3937p4, C4096z4 c4096z4) {
        c4096z4.getClass();
        c3937p4.m29155b1();
        c3937p4.zzj.add(c4096z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public static /* synthetic */ void m29204F0(C3937p4 c3937p4, int i) {
        c3937p4.m29155b1();
        c3937p4.zzj.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public static /* synthetic */ void m29201G0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 2;
        c3937p4.zzk = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static /* synthetic */ void m29198H0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 4;
        c3937p4.zzl = j;
    }

    /* renamed from: H1 */
    public static C3922o4 m29197H1() {
        return zze.m29388p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public static /* synthetic */ void m29195I0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 8;
        c3937p4.zzm = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static /* synthetic */ void m29192J0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 16;
        c3937p4.zzn = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public static /* synthetic */ void m29189K0(C3937p4 c3937p4) {
        c3937p4.zzf &= -17;
        c3937p4.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m29185M(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 1073741824;
        c3937p4.zzO = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static /* synthetic */ void m29184M0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 32;
        c3937p4.zzo = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m29182N(C3937p4 c3937p4) {
        c3937p4.zzf &= Integer.MAX_VALUE;
        c3937p4.zzP = zze.zzP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public static /* synthetic */ void m29181N0(C3937p4 c3937p4) {
        c3937p4.zzf &= -33;
        c3937p4.zzo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static /* synthetic */ void m29180O(C3937p4 c3937p4, int i) {
        c3937p4.zzg |= 2;
        c3937p4.zzR = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public static /* synthetic */ void m29179O0(C3937p4 c3937p4, String str) {
        c3937p4.zzf |= 64;
        c3937p4.zzp = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static /* synthetic */ void m29178P(C3937p4 c3937p4, int i, C3779f4 c3779f4) {
        c3779f4.getClass();
        c3937p4.m29157a1();
        c3937p4.zzi.set(i, c3779f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static /* synthetic */ void m29177P0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 128;
        c3937p4.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static /* synthetic */ void m29176Q(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzg |= 4;
        c3937p4.zzS = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static /* synthetic */ void m29175R(C3937p4 c3937p4, Iterable iterable) {
        InterfaceC3956q8 interfaceC3956q8 = c3937p4.zzU;
        if (!interfaceC3956q8.mo28973c()) {
            int size = interfaceC3956q8.size();
            c3937p4.zzU = interfaceC3956q8.mo29082S(size == 0 ? 10 : size + size);
        }
        AbstractC3704a7.m29846h(iterable, c3937p4.zzU);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public static /* synthetic */ void m29174R0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 256;
        c3937p4.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static /* synthetic */ void m29173S(C3937p4 c3937p4, C3779f4 c3779f4) {
        c3779f4.getClass();
        c3937p4.m29157a1();
        c3937p4.zzi.add(c3779f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public static /* synthetic */ void m29172S0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        c3937p4.zzs = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static /* synthetic */ void m29171T(C3937p4 c3937p4, long j) {
        c3937p4.zzg |= 16;
        c3937p4.zzV = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public static /* synthetic */ void m29170T0(C3937p4 c3937p4, int i) {
        c3937p4.zzf |= 1024;
        c3937p4.zzt = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static /* synthetic */ void m29169U(C3937p4 c3937p4, long j) {
        c3937p4.zzg |= 32;
        c3937p4.zzW = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public static /* synthetic */ void m29168U0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
        c3937p4.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public static /* synthetic */ void m29166V0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 4096;
        c3937p4.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static /* synthetic */ void m29165W(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 65536;
        c3937p4.zzz = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public static /* synthetic */ void m29164W0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 8192;
        c3937p4.zzw = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static /* synthetic */ void m29163X(C3937p4 c3937p4) {
        c3937p4.zzf &= -65537;
        c3937p4.zzz = zze.zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public static /* synthetic */ void m29162X0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 16384;
        c3937p4.zzx = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static /* synthetic */ void m29161Y(C3937p4 c3937p4, boolean z) {
        c3937p4.zzf |= 131072;
        c3937p4.zzA = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public static /* synthetic */ void m29160Y0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 32768;
        c3937p4.zzy = 46000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static /* synthetic */ void m29158a0(C3937p4 c3937p4) {
        c3937p4.zzf &= -131073;
        c3937p4.zzA = false;
    }

    /* renamed from: a1 */
    private final void m29157a1() {
        InterfaceC3988s8<C3779f4> interfaceC3988s8 = this.zzi;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzi = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* synthetic */ void m29156b0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 262144;
        c3937p4.zzB = str;
    }

    /* renamed from: b1 */
    private final void m29155b1() {
        InterfaceC3988s8<C4096z4> interfaceC3988s8 = this.zzj;
        if (interfaceC3988s8.mo28973c()) {
            return;
        }
        this.zzj = AbstractC3894m8.m29392l(interfaceC3988s8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* synthetic */ void m29154c0(C3937p4 c3937p4) {
        c3937p4.zzf &= -262145;
        c3937p4.zzB = zze.zzB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* synthetic */ void m29152d0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 524288;
        c3937p4.zzC = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public static /* synthetic */ void m29150e0(C3937p4 c3937p4, int i) {
        c3937p4.zzf |= 1048576;
        c3937p4.zzD = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static /* synthetic */ void m29148f0(C3937p4 c3937p4, String str) {
        c3937p4.zzf |= 2097152;
        c3937p4.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* synthetic */ void m29146g0(C3937p4 c3937p4) {
        c3937p4.zzf &= -2097153;
        c3937p4.zzE = zze.zzE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static /* synthetic */ void m29144h0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 4194304;
        c3937p4.zzF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static /* synthetic */ void m29142i0(C3937p4 c3937p4, boolean z) {
        c3937p4.zzf |= 8388608;
        c3937p4.zzG = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public static /* synthetic */ void m29140j0(C3937p4 c3937p4, Iterable iterable) {
        InterfaceC3988s8<C3718b4> interfaceC3988s8 = c3937p4.zzH;
        if (!interfaceC3988s8.mo28973c()) {
            c3937p4.zzH = AbstractC3894m8.m29392l(interfaceC3988s8);
        }
        AbstractC3704a7.m29846h(iterable, c3937p4.zzH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public static /* synthetic */ void m29135m0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzf |= 16777216;
        c3937p4.zzI = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public static /* synthetic */ void m29133n0(C3937p4 c3937p4, int i) {
        c3937p4.zzf |= 33554432;
        c3937p4.zzJ = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public static /* synthetic */ void m29131o0(C3937p4 c3937p4, int i) {
        c3937p4.zzf |= 1;
        c3937p4.zzh = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public static /* synthetic */ void m29129p0(C3937p4 c3937p4) {
        c3937p4.zzf &= -268435457;
        c3937p4.zzM = zze.zzM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static /* synthetic */ void m29127q0(C3937p4 c3937p4, long j) {
        c3937p4.zzf |= 536870912;
        c3937p4.zzN = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public static /* synthetic */ void m29108y0(C3937p4 c3937p4, String str) {
        str.getClass();
        c3937p4.zzg |= 64;
        c3937p4.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public static /* synthetic */ void m29105z0(C3937p4 c3937p4, String str) {
        c3937p4.zzg |= 128;
        c3937p4.zzY = str;
    }

    /* renamed from: A */
    public final String m29220A() {
        return this.zzP;
    }

    /* renamed from: A1 */
    public final long m29218A1() {
        return this.zzx;
    }

    /* renamed from: B */
    public final String m29217B() {
        return this.zzI;
    }

    /* renamed from: B1 */
    public final long m29215B1() {
        return this.zzo;
    }

    /* renamed from: C */
    public final String m29214C() {
        return this.zzX;
    }

    /* renamed from: C1 */
    public final long m29212C1() {
        return this.zzn;
    }

    /* renamed from: D */
    public final String m29211D() {
        return this.zzF;
    }

    /* renamed from: D1 */
    public final long m29209D1() {
        return this.zzl;
    }

    /* renamed from: E */
    public final String m29208E() {
        return this.zzE;
    }

    /* renamed from: E1 */
    public final long m29206E1() {
        return this.zzk;
    }

    /* renamed from: F */
    public final String m29205F() {
        return this.zzq;
    }

    /* renamed from: F1 */
    public final long m29203F1() {
        return this.zzy;
    }

    /* renamed from: G */
    public final String m29202G() {
        return this.zzp;
    }

    /* renamed from: G1 */
    public final C3779f4 m29200G1(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: H */
    public final String m29199H() {
        return this.zzz;
    }

    /* renamed from: I */
    public final String m29196I() {
        return this.zzs;
    }

    /* renamed from: J */
    public final List<C3718b4> m29193J() {
        return this.zzH;
    }

    /* renamed from: J1 */
    public final C4096z4 m29191J1(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: K */
    public final List<C3779f4> m29190K() {
        return this.zzi;
    }

    /* renamed from: K1 */
    public final String m29188K1() {
        return this.zzS;
    }

    /* renamed from: L */
    public final List<C4096z4> m29187L() {
        return this.zzj;
    }

    /* renamed from: L1 */
    public final String m29186L1() {
        return this.zzv;
    }

    /* renamed from: M1 */
    public final String m29183M1() {
        return this.zzB;
    }

    /* renamed from: V */
    public final int m29167V() {
        return this.zzJ;
    }

    /* renamed from: Z0 */
    public final int m29159Z0() {
        return this.zzD;
    }

    /* renamed from: c1 */
    public final boolean m29153c1() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: d1 */
    public final boolean m29151d1() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: e1 */
    public final boolean m29149e1() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: f1 */
    public final boolean m29147f1() {
        return (this.zzf & 16384) != 0;
    }

    /* renamed from: g1 */
    public final boolean m29145g1() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: h1 */
    public final boolean m29143h1() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: i1 */
    public final boolean m29141i1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: j1 */
    public final boolean m29139j1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: k1 */
    public final boolean m29138k1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: l1 */
    public final boolean m29136l1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: m1 */
    public final boolean m29134m1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: n1 */
    public final boolean m29132n1() {
        return (this.zzf & 1024) != 0;
    }

    /* renamed from: o1 */
    public final boolean m29130o1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: p1 */
    public final boolean m29128p1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: q1 */
    public final int m29126q1() {
        return this.zzi.size();
    }

    /* renamed from: r0 */
    public final boolean m29125r0() {
        return this.zzA;
    }

    /* renamed from: r1 */
    public final int m29124r1() {
        return this.zzh;
    }

    /* renamed from: s0 */
    public final boolean m29123s0() {
        return this.zzG;
    }

    /* renamed from: s1 */
    public final int m29122s1() {
        return this.zzR;
    }

    /* renamed from: t0 */
    public final boolean m29121t0() {
        return (this.zzf & 1073741824) != 0;
    }

    /* renamed from: t1 */
    public final int m29120t1() {
        return this.zzt;
    }

    /* renamed from: u0 */
    public final boolean m29119u0() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: u1 */
    public final int m29118u1() {
        return this.zzj.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC3894m8
    /* renamed from: v */
    public final Object mo28554v(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new C3922o4(null);
                }
                return new C3937p4();
            }
            return AbstractC3894m8.m29390n(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", C3779f4.class, "zzj", C4096z4.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C3718b4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C4063x3.f9834a, "zzaa", "zzab", "zzac", "zzad"});
        }
        return (byte) 1;
    }

    /* renamed from: v0 */
    public final boolean m29117v0() {
        return (this.zzf & 1048576) != 0;
    }

    /* renamed from: v1 */
    public final long m29116v1() {
        return this.zzO;
    }

    /* renamed from: w */
    public final String m29115w() {
        return this.zzu;
    }

    /* renamed from: w0 */
    public final boolean m29114w0() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: w1 */
    public final long m29113w1() {
        return this.zzN;
    }

    /* renamed from: x */
    public final String m29112x() {
        return this.zzw;
    }

    /* renamed from: x0 */
    public final boolean m29111x0() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: x1 */
    public final long m29110x1() {
        return this.zzC;
    }

    /* renamed from: y */
    public final String m29109y() {
        return this.zzY;
    }

    /* renamed from: y1 */
    public final long m29107y1() {
        return this.zzV;
    }

    /* renamed from: z */
    public final String m29106z() {
        return this.zzr;
    }

    /* renamed from: z1 */
    public final long m29104z1() {
        return this.zzm;
    }
}
