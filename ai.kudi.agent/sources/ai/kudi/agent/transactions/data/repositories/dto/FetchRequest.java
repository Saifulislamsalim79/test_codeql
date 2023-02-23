package ai.kudi.agent.transactions.data.repositories.dto;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11804o;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p557z.C13721o0;
import kotlin.p557z.C13723p0;
/* compiled from: FetchRequest.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J!\u0010B\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0004HÖ\u0001R/\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR/\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR/\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R/\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR/\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR/\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR/\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\r\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR/\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR/\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\r\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR/\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR/\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000b¨\u0006I"}, m10421d2 = {"Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "", "params", "", "", "(Ljava/util/Map;)V", "<set-?>", "agentUid", "getAgentUid", "()Ljava/lang/String;", "setAgentUid", "(Ljava/lang/String;)V", "agentUid$delegate", "Ljava/util/Map;", "defaultMap", "email", "getEmail", "setEmail", "email$delegate", "from", "getFrom", "setFrom", "from$delegate", "limit", "getLimit", "setLimit", "limit$delegate", "page", "getPage", "setPage", "page$delegate", "getParams", "()Ljava/util/Map;", "product_type", "getProduct_type", "setProduct_type", "product_type$delegate", "sortOrder", "getSortOrder", "setSortOrder", "sortOrder$delegate", TransactionField.TRANSACTION_CHANNEL, "getSource", "setSource", "source$delegate", TransactionField.STATUS, "getStatus", "setStatus", "status$delegate", "to", "getTo", "setTo", "to$delegate", "type", "getType", "setType", "type$delegate", "value", "getValue", "setValue", "value$delegate", "walletId", "getWalletId", "setWalletId", "walletId$delegate", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchRequest {
    static final /* synthetic */ InterfaceC11872i<Object>[] $$delegatedProperties;
    private final Map agentUid$delegate;
    private final Map<String, String> defaultMap;
    private final Map email$delegate;
    private final Map from$delegate;
    private final Map limit$delegate;
    private final Map page$delegate;
    private final Map<String, String> params;
    private final Map product_type$delegate;
    private final Map sortOrder$delegate;
    private final Map source$delegate;
    private final Map status$delegate;
    private final Map to$delegate;
    private final Map type$delegate;
    private final Map value$delegate;
    private final Map walletId$delegate;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        InterfaceC11863b $r2 = C11813x.m10316b(FetchRequest.class);
        C11804o r4 = new C11804o($r2, "page", "getPage()Ljava/lang/String;");
        InterfaceC11872i $r3 = C11813x.m10313e(r4);
        InterfaceC11863b $r22 = C11813x.m10316b(FetchRequest.class);
        C11804o r42 = new C11804o($r22, TransactionField.STATUS, "getStatus()Ljava/lang/String;");
        InterfaceC11872i $r32 = C11813x.m10313e(r42);
        InterfaceC11863b $r23 = C11813x.m10316b(FetchRequest.class);
        C11804o r43 = new C11804o($r23, "type", "getType()Ljava/lang/String;");
        InterfaceC11872i $r33 = C11813x.m10313e(r43);
        InterfaceC11863b $r24 = C11813x.m10316b(FetchRequest.class);
        C11804o r44 = new C11804o($r24, TransactionField.TRANSACTION_CHANNEL, "getSource()Ljava/lang/String;");
        InterfaceC11872i $r34 = C11813x.m10313e(r44);
        InterfaceC11863b $r25 = C11813x.m10316b(FetchRequest.class);
        C11804o r45 = new C11804o($r25, "from", "getFrom()Ljava/lang/String;");
        InterfaceC11872i $r35 = C11813x.m10313e(r45);
        InterfaceC11863b $r26 = C11813x.m10316b(FetchRequest.class);
        C11804o r46 = new C11804o($r26, "to", "getTo()Ljava/lang/String;");
        InterfaceC11872i $r36 = C11813x.m10313e(r46);
        InterfaceC11863b $r27 = C11813x.m10316b(FetchRequest.class);
        C11804o r47 = new C11804o($r27, "limit", "getLimit()Ljava/lang/String;");
        InterfaceC11872i $r37 = C11813x.m10313e(r47);
        InterfaceC11863b $r28 = C11813x.m10316b(FetchRequest.class);
        C11804o r48 = new C11804o($r28, "email", "getEmail()Ljava/lang/String;");
        InterfaceC11872i $r38 = C11813x.m10313e(r48);
        InterfaceC11863b $r29 = C11813x.m10316b(FetchRequest.class);
        C11804o r49 = new C11804o($r29, "value", "getValue()Ljava/lang/String;");
        InterfaceC11872i $r39 = C11813x.m10313e(r49);
        InterfaceC11863b $r210 = C11813x.m10316b(FetchRequest.class);
        C11804o r410 = new C11804o($r210, "product_type", "getProduct_type()Ljava/lang/String;");
        InterfaceC11872i $r310 = C11813x.m10313e(r410);
        InterfaceC11863b $r211 = C11813x.m10316b(FetchRequest.class);
        C11804o r411 = new C11804o($r211, "walletId", "getWalletId()Ljava/lang/String;");
        InterfaceC11872i $r311 = C11813x.m10313e(r411);
        InterfaceC11863b $r212 = C11813x.m10316b(FetchRequest.class);
        C11804o r412 = new C11804o($r212, "agentUid", "getAgentUid()Ljava/lang/String;");
        InterfaceC11872i $r312 = C11813x.m10313e(r412);
        InterfaceC11863b $r213 = C11813x.m10316b(FetchRequest.class);
        C11804o r413 = new C11804o($r213, "sortOrder", "getSortOrder()Ljava/lang/String;");
        InterfaceC11872i $r313 = C11813x.m10313e(r413);
        InterfaceC11872i[] $r0 = {$r3, $r32, $r33, $r34, $r35, $r36, $r37, $r38, $r39, $r310, $r311, $r312, $r313};
        InterfaceC11872i[] r5 = $r0;
        $$delegatedProperties = r5;
    }

    public FetchRequest() {
        this(null, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchRequest(Map map) {
        Map $r1;
        Log_OC.getArray(map, "params");
        this.params = map;
        FetchRequest$defaultMap$1 $r2 = FetchRequest$defaultMap$1.INSTANCE;
        $r1 = C13723p0.m3903c(map, $r2);
        this.defaultMap = $r1;
        this.page$delegate = $r1;
        this.status$delegate = $r1;
        this.type$delegate = $r1;
        this.source$delegate = $r1;
        this.from$delegate = $r1;
        this.to$delegate = $r1;
        this.limit$delegate = $r1;
        this.email$delegate = $r1;
        this.value$delegate = $r1;
        this.product_type$delegate = $r1;
        this.walletId$delegate = $r1;
        this.agentUid$delegate = $r1;
        this.sortOrder$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FetchRequest(java.util.Map r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r3 = this;
            r5 = r5 & 1
            if (r5 == 0) goto La
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r4 = r0
            r0.<init>()
        La:
            r2 = r4
            java.util.Map r2 = (java.util.Map) r2
            r1 = r2
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.data.repositories.dto.FetchRequest.<init>(java.util.Map, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ FetchRequest copy$default(FetchRequest fetchRequest, Map $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = fetchRequest.params;
        }
        FetchRequest $r1 = fetchRequest.copy($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component1() {
        Map r1 = this.params;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchRequest copy(Map map) {
        Log_OC.getArray(map, "params");
        FetchRequest $r0 = new FetchRequest(map);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof FetchRequest;
        if ($z0) {
            FetchRequest $r2 = (FetchRequest) obj;
            Map $r3 = this.params;
            Map $r4 = $r2.params;
            boolean $z02 = Log_OC.append($r3, $r4);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentUid() {
        Map $r1 = this.agentUid$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[11];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEmail() {
        Map $r1 = this.email$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[7];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFrom() {
        Map $r1 = this.from$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[4];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLimit() {
        Map $r1 = this.limit$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[6];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPage() {
        Map $r1 = this.page$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[0];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getParams() {
        Map r1 = this.params;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProduct_type() {
        Map $r1 = this.product_type$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[9];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSortOrder() {
        Map $r1 = this.sortOrder$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[12];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSource() {
        Map $r1 = this.source$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[3];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatus() {
        Map $r1 = this.status$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[1];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTo() {
        Map $r1 = this.to$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[5];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getType() {
        Map $r1 = this.type$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[2];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getValue() {
        Map $r1 = this.value$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[8];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getWalletId() {
        Map $r1 = this.walletId$delegate;
        InterfaceC11872i[] $r2 = $$delegatedProperties;
        InterfaceC11872i $r3 = $r2[10];
        String $r4 = $r3.mo4699b();
        Object $r5 = C13721o0.m3992a($r1, $r4);
        String $r42 = (String) $r5;
        return $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        Map $r1 = this.params;
        int $i0 = $r1.hashCode();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setAgentUid(String str) {
        Map $r2 = this.agentUid$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[11];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setEmail(String str) {
        Map $r2 = this.email$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[7];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFrom(String str) {
        Map $r2 = this.from$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[4];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setLimit(String str) {
        Map $r2 = this.limit$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[6];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setPage(String str) {
        Map $r2 = this.page$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[0];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProduct_type(String str) {
        Map $r2 = this.product_type$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[9];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setSortOrder(String str) {
        Map $r2 = this.sortOrder$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[12];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setSource(String str) {
        Map $r2 = this.source$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[3];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setStatus(String str) {
        Map $r2 = this.status$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[1];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTo(String str) {
        Map $r2 = this.to$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[5];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setType(String str) {
        Map $r2 = this.type$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[2];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setValue(String str) {
        Map $r2 = this.value$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[8];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setWalletId(String str) {
        Map $r2 = this.walletId$delegate;
        InterfaceC11872i[] $r4 = $$delegatedProperties;
        InterfaceC11872i $r5 = $r4[10];
        String $r3 = $r5.mo4699b();
        $r2.put($r3, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("FetchRequest(params=");
        Map $r3 = this.params;
        $r2.append($r3);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
