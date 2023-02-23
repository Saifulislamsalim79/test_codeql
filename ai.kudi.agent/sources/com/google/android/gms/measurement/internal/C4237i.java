package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3867kc;
import java.util.List;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes.dex */
public final class C4237i extends AbstractC4413x {

    /* renamed from: a */
    private String f10348a;

    /* renamed from: b */
    private String f10349b;

    /* renamed from: c */
    private long f10350c;

    /* renamed from: d */
    private String f10351d;

    /* renamed from: e */
    private String f10352e;

    /* renamed from: g */
    private String f10353g;

    /* renamed from: j */
    private int f10354j;

    /* renamed from: l */
    private List<String> f10355l;

    /* renamed from: n */
    private int f10356n;

    /* renamed from: q */
    private String f10357q;

    /* renamed from: t */
    private final long f10358t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4237i(ClassWriter classWriter, long j) {
        super(classWriter);
        this.f10358t = j;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0367  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.C4307na m28173a(java.lang.String r94) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4237i.m28173a(java.lang.String):com.google.android.gms.measurement.internal.na");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(1:3)(7:103|104|(1:106)(2:119|(1:121))|107|108|109|(4:111|112|(1:114)|116))|4|(2:6|(24:8|9|10|12|(1:14)|15|16|17|18|19|20|(1:22)(1:91)|23|24|25|26|27|28|(15:30|31|32|33|34|35|(1:37)|38|39|(1:41)|42|43|(1:45)|76|77)(2:78|(9:80|81|82|83|84|85|(2:87|88)|89|90))|(6:48|49|50|51|(1:53)(1:56)|54)|57|(3:59|(1:61)(3:68|(2:71|(1:73))|74)|(2:63|64)(2:66|67))|75|(0)(0)))|102|9|10|12|(0)|15|16|17|18|19|20|(0)(0)|23|24|25|26|27|28|(0)(0)|(0)|57|(0)|75|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c2, code lost:
        r28 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c3, code lost:
        r3 = ((com.google.android.gms.measurement.internal.MethodWriter) r35).f9987b;
        r11 = r3.get();
        r12 = r11.m28416b();
        r13 = com.google.android.gms.measurement.internal.Item.toString(r5);
        r12.m28012c("Fetching Google App Id failed with exception. appId", r13, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0252, code lost:
        if (r16 == false) goto L76;
     */
    /* JADX WARN: Incorrect condition in loop: B:113:0x0322 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261 A[Catch: IllegalStateException -> 0x02c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x02c2, blocks: (B:45:0x01cb, B:47:0x01d3, B:53:0x01f1, B:55:0x01f8, B:57:0x01fe, B:60:0x0210, B:62:0x0218, B:64:0x021d, B:67:0x022b, B:68:0x022f, B:73:0x0248, B:75:0x024e, B:95:0x029d, B:97:0x02ad, B:101:0x02bc, B:77:0x0254, B:79:0x0261, B:82:0x026b, B:84:0x0273, B:86:0x0278, B:89:0x0286, B:91:0x028b), top: B:127:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0299  */
    @Override // com.google.android.gms.measurement.internal.AbstractC4413x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mo27843a() {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4237i.mo27843a():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final String m28172b() {
        C3867kc.m29418b();
        ClassWriter $r2 = ((MethodWriter) this).f9987b;
        C4215g $r3 = $r2.getValue();
        C4162b3 $r1 = C4173c3.f10148q0;
        boolean $z0 = $r3.m28265a((String) null, $r1);
        if ($z0) {
            putShort();
        }
        next();
        String $r4 = this.f10352e;
        com.google.android.gms.common.internal.List.m31820a($r4);
        String $r42 = this.f10352e;
        return $r42;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final String m28171d() {
        next();
        String $r1 = this.f10357q;
        com.google.android.gms.common.internal.List.m31820a($r1);
        String $r12 = this.f10357q;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    final int m28170e() {
        next();
        int i0 = this.f10354j;
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final String m28169f() {
        next();
        String r1 = this.f10353g;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getItem() {
        next();
        String $r1 = this.f10348a;
        com.google.android.gms.common.internal.List.m31820a($r1);
        String $r12 = this.f10348a;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    final List m28168i() {
        List r1 = this.f10355l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: j */
    final int m28167j() {
        next();
        int i0 = this.f10356n;
        return i0;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4413x
    /* renamed from: n */
    protected final boolean mo27842n() {
        return true;
    }
}
