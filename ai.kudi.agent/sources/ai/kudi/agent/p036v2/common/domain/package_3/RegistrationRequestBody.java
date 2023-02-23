package ai.kudi.agent.p036v2.common.domain.package_3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: RegistrationRequestBody.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/dto/RegistrationRequestBody;", "", "agentId", "", "latitude", "", "longitude", "onboardingData", "", "productCode", "(Ljava/lang/String;DDLjava/util/Map;Ljava/lang/String;)V", "getAgentId", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "getOnboardingData", "()Ljava/util/Map;", "getProductCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.package_3.RegistrationRequestBody */
/* loaded from: classes.dex */
public final class RegistrationRequestBody {
    private final String agentId;
    private final double latitude;
    private final double longitude;
    private final Map<String, Object> onboardingData;
    private final String productCode;

    public RegistrationRequestBody(String str, double d, double d2, Map map, String str2) {
        Log_OC.getArray(str, "agentId");
        Log_OC.getArray(map, "onboardingData");
        Log_OC.getArray(str2, "productCode");
        this.agentId = str;
        this.latitude = d;
        this.longitude = d2;
        this.onboardingData = map;
        this.productCode = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RegistrationRequestBody(java.lang.String r2, double r3, double r5, java.util.Map r7, java.lang.String r8, int r9, kotlin.p483e0.p485d.DBUtils$1 r10) {
        /*
            r1 = this;
            r0 = r9 & 2
            if (r0 == 0) goto L7
            r3 = 0
            goto L7
        L7:
            r0 = r9 & 4
            if (r0 == 0) goto Le
            r5 = 0
            goto Le
        Le:
            r9 = r9 & 8
            if (r9 == 0) goto L17
            java.util.Map r7 = kotlin.p557z.C13721o0.m3983k()
            goto L17
        L17:
            r1.<init>(r2, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.domain.package_3.RegistrationRequestBody.<init>(java.lang.String, double, double, java.util.Map, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ RegistrationRequestBody copy$default(RegistrationRequestBody registrationRequestBody, String $r1, double $d0, double $d1, Map $r2, String $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = registrationRequestBody.agentId;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $d0 = registrationRequestBody.latitude;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $d1 = registrationRequestBody.longitude;
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r2 = registrationRequestBody.onboardingData;
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $r3 = registrationRequestBody.productCode;
        }
        RegistrationRequestBody $r0 = registrationRequestBody.copy($r1, $d0, $d1, $r2, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component2() {
        double d0 = this.latitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component3() {
        double d0 = this.longitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map component4() {
        Map r1 = this.onboardingData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.productCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationRequestBody copy(String str, double d, double d2, Map map, String str2) {
        Log_OC.getArray(str, "agentId");
        Log_OC.getArray(map, "onboardingData");
        Log_OC.getArray(str2, "productCode");
        RegistrationRequestBody $r0 = new RegistrationRequestBody(str, d, d2, map, str2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof RegistrationRequestBody;
        if ($z0) {
            RegistrationRequestBody $r2 = (RegistrationRequestBody) obj;
            String $r3 = this.agentId;
            String $r4 = $r2.agentId;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                double $d0 = this.latitude;
                Double $r5 = Double.valueOf($d0);
                double $d02 = $r2.latitude;
                Double $r6 = Double.valueOf($d02);
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    double $d03 = this.longitude;
                    Double $r52 = Double.valueOf($d03);
                    double $d04 = $r2.longitude;
                    Double $r62 = Double.valueOf($d04);
                    boolean $z04 = Log_OC.append($r52, $r62);
                    if ($z04) {
                        Map $r7 = this.onboardingData;
                        Map $r8 = $r2.onboardingData;
                        boolean $z05 = Log_OC.append($r7, $r8);
                        if ($z05) {
                            String $r32 = this.productCode;
                            String $r42 = $r2.productCode;
                            boolean $z06 = Log_OC.append($r32, $r42);
                            return $z06;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentId() {
        String r1 = this.agentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getLatitude() {
        double d0 = this.latitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getLongitude() {
        double d0 = this.longitude;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getOnboardingData() {
        Map r1 = this.onboardingData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProductCode() {
        String r1 = this.productCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.agentId;
        int $i0 = $r1.hashCode();
        double $d0 = this.latitude;
        int $i1 = Tags.append($d0);
        double $d02 = this.longitude;
        int $i12 = Tags.append($d02);
        Map $r2 = this.onboardingData;
        int $i13 = $r2.hashCode();
        String $r12 = this.productCode;
        int $i14 = $r12.hashCode();
        return ((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("RegistrationRequestBody(agentId=");
        String $r1 = this.agentId;
        $r2.append($r1);
        $r2.append(", latitude=");
        double $d0 = this.latitude;
        $r2.append($d0);
        $r2.append(", longitude=");
        double $d02 = this.longitude;
        $r2.append($d02);
        $r2.append(", onboardingData=");
        Map $r3 = this.onboardingData;
        $r2.append($r3);
        $r2.append(", productCode=");
        String $r12 = this.productCode;
        $r2.append($r12);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }
}
