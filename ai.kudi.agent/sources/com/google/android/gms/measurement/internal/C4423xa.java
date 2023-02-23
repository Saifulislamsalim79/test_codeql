package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.xa */
/* loaded from: classes2.dex */
public final class C4423xa extends AbstractC4353r9 {

    /* renamed from: d */
    private String f10812d;

    /* renamed from: e */
    private Set<Integer> f10813e;

    /* renamed from: f */
    private Map<Integer, C4354ra> f10814f;

    /* renamed from: g */
    private Long f10815g;

    /* renamed from: h */
    private Long f10816h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4423xa(C4168ba c4168ba) {
        super(c4168ba);
    }

    /* renamed from: n */
    private final C4354ra m27833n(Integer num) {
        if (this.f10814f.containsKey(num)) {
            return this.f10814f.get(num);
        }
        C4354ra c4354ra = new C4354ra(this, this.f10812d, null);
        this.f10814f.put(num, c4354ra);
        return c4354ra;
    }

    /* renamed from: o */
    private final boolean m27832o(int i, int i2) {
        C4354ra c4354ra = this.f10814f.get(Integer.valueOf(i));
        if (c4354ra == null) {
            return false;
        }
        return C4354ra.m27982b(c4354ra).get(i2);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:19|20|21|22|23|(22:(7:25|26|27|28|(1:30)(3:502|(1:504)(1:506)|505)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:459|(6:460|461|462|463|464|(1:467)(1:466))|(1:469)|470)|48|(5:294|(3:296|(6:298|299|300|301|302|(2:(3:304|(1:306)|307)|309)(1:353))|367)(1:458)|368|(10:371|(3:375|(4:378|(5:380|381|(1:383)(1:387)|384|385)(1:388)|386|376)|389)|390|(3:394|(4:397|(3:402|403|404)|405|395)|408)|409|(3:411|(6:414|(2:416|(3:418|419|420))(1:423)|421|422|420|412)|424)|425|(3:434|(8:437|(1:439)|440|(1:442)|443|(3:445|446|447)(1:449)|448|435)|450)|451|369)|457)|50|51|(3:183|(4:186|(9:188|(1:190)(1:291)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:259)|214|215|(1:218)(1:217))|(1:220)|221)(2:269|270)|222)(1:290)|223|(4:226|(3:244|245|246)(6:228|229|(2:230|(2:232|(1:234)(2:235|236))(2:242|243))|(1:238)|239|240)|241|224)|247|248|249)(1:292)|250|184)|293)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:181)|108|(2:109|(2:111|(3:147|148|149)(6:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|(2:135|134)|132|133|134))(0))|150|82)|182)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:510))|41|42|(0)(0)|48|(0)|50|51|(0)|53|54|(0)|56|57|(1:58)|78|79) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(2:2|(2:4|(2:6|7))(2:526|527))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(22:(7:25|26|27|28|(1:30)(3:502|(1:504)(1:506)|505)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:459|(6:460|461|462|463|464|(1:467)(1:466))|(1:469)|470)|48|(5:294|(3:296|(6:298|299|300|301|302|(2:(3:304|(1:306)|307)|309)(1:353))|367)(1:458)|368|(10:371|(3:375|(4:378|(5:380|381|(1:383)(1:387)|384|385)(1:388)|386|376)|389)|390|(3:394|(4:397|(3:402|403|404)|405|395)|408)|409|(3:411|(6:414|(2:416|(3:418|419|420))(1:423)|421|422|420|412)|424)|425|(3:434|(8:437|(1:439)|440|(1:442)|443|(3:445|446|447)(1:449)|448|435)|450)|451|369)|457)|50|51|(3:183|(4:186|(9:188|(1:190)(1:291)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:259)|214|215|(1:218)(1:217))|(1:220)|221)(2:269|270)|222)(1:290)|223|(4:226|(3:244|245|246)(6:228|229|(2:230|(2:232|(1:234)(2:235|236))(2:242|243))|(1:238)|239|240)|241|224)|247|248|249)(1:292)|250|184)|293)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:181)|108|(2:109|(2:111|(3:147|148|149)(6:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|(2:135|134)|132|133|134))(0))|150|82)|182)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:510))|525|38|39|40|41|42|(0)(0)|48|(0)|50|51|(0)|53|54|(0)|56|57|(1:58)|78|79|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e1, code lost:
        if (r5 != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e3, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02eb, code lost:
        if (r5 != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0310, code lost:
        if (r5 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0313, code lost:
        r1 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x031f, code lost:
        if (r1.hasNext() == false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0321, code lost:
        r4 = ((java.lang.Integer) r1.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.C4032v4) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033b, code lost:
        if (r7 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0341, code lost:
        if (r7.isEmpty() == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0345, code lost:
        r17 = r0;
        r0 = r65.f10625b.m28364e0().m28295I(r6.m28793G(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0359, code lost:
        if (r0.isEmpty() != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x035b, code lost:
        r5 = r6.m29387q();
        r5.m28883v();
        r5.m28886s(r0);
        r20 = r1;
        r0 = r65.f10625b.m28364e0().m28295I(r6.m28791I(), r7);
        r5.m28882w();
        r5.m28884u(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0382, code lost:
        if (r0 >= r6.m28780w()) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0394, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.m28799A(r0).m29681w())) == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0396, code lost:
        r5.m28881x(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0399, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x039c, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03a1, code lost:
        if (r0 >= r6.m28778y()) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03b3, code lost:
        if (r7.contains(java.lang.Integer.valueOf(r6.m28795E(r0).m28663x())) == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03b5, code lost:
        r5.m28880y(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03b8, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03bb, code lost:
        r3.put(java.lang.Integer.valueOf(r4), r5.m29456k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03c9, code lost:
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cd, code lost:
        r17 = r0;
        r20 = r1;
        r3.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03d4, code lost:
        r0 = r17;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0729, code lost:
        if (r11 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x072b, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0763, code lost:
        if (r11 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08f8, code lost:
        if (r13 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08fa, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0922, code lost:
        if (r13 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0a22, code lost:
        r0 = ((com.google.android.gms.measurement.internal.v5) r65).a.b().w();
        r6 = com.google.android.gms.measurement.internal.q3.z(r65.f10812d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0a36, code lost:
        if (r7.m29494F() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a38, code lost:
        r7 = java.lang.Integer.valueOf(r7.m29492w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0a41, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0a42, code lost:
        r0.m28012c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
        if (r5 != null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0152, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0176, code lost:
        if (r5 == null) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0228, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0229, code lost:
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0230, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0231, code lost:
        r18 = "audience_id";
        r19 = ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType.DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0236, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0239, code lost:
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5 A[Catch: SQLiteException -> 0x0228, all -> 0x0b0f, TRY_LEAVE, TryCatch #11 {SQLiteException -> 0x0228, blocks: (B:63:0x01af, B:65:0x01b5, B:69:0x01c5, B:70:0x01ca, B:71:0x01d4, B:72:0x01e3, B:74:0x01f2), top: B:458:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5 A[Catch: SQLiteException -> 0x0228, all -> 0x0b0f, TRY_ENTER, TryCatch #11 {SQLiteException -> 0x0228, blocks: (B:63:0x01af, B:65:0x01b5, B:69:0x01c5, B:70:0x01ca, B:71:0x01d4, B:72:0x01e3, B:74:0x01f2), top: B:458:0x01af }] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.C3718b4> m27834m(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.C3779f4> r67, java.util.List<com.google.android.gms.internal.measurement.C4096z4> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            Method dump skipped, instructions count: 2841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4423xa.m27834m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
