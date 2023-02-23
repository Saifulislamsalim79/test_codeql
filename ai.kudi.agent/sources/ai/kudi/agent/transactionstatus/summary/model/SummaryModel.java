package ai.kudi.agent.transactionstatus.summary.model;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SummaryModel.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "", "label", "", "value", "isEditAvailable", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "()Z", "getLabel", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SummaryModel {
    private final Fragment fragment;
    private final boolean isEditAvailable;
    private final String label;
    private final String value;

    public SummaryModel(String str, String str2, boolean z, Fragment fragment) {
        Log_OC.getArray(str, "label");
        Log_OC.getArray(str2, "value");
        this.label = str;
        this.value = str2;
        this.isEditAvailable = z;
        this.fragment = fragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SummaryModel(java.lang.String r2, java.lang.String r3, boolean r4, androidx.fragment.app.Fragment r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r1 = this;
            r0 = r6 & 4
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 8
            if (r6 == 0) goto La
            r5 = 0
        La:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionstatus.summary.model.SummaryModel.<init>(java.lang.String, java.lang.String, boolean, androidx.fragment.app.Fragment, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ SummaryModel copy$default(SummaryModel summaryModel, String $r1, String $r2, boolean $z0, Fragment $r3, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = summaryModel.label;
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = summaryModel.value;
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $z0 = summaryModel.isEditAvailable;
        }
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r3 = summaryModel.fragment;
        }
        SummaryModel $r0 = summaryModel.copy($r1, $r2, $z0, $r3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.label;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.value;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component3() {
        boolean z0 = this.isEditAvailable;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Fragment component4() {
        Fragment r1 = this.fragment;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SummaryModel copy(String str, String str2, boolean z, Fragment fragment) {
        Log_OC.getArray(str, "label");
        Log_OC.getArray(str2, "value");
        SummaryModel $r0 = new SummaryModel(str, str2, z, fragment);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof SummaryModel;
        if ($z0) {
            SummaryModel $r2 = (SummaryModel) obj;
            String $r3 = this.label;
            String $r4 = $r2.label;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.value;
                String $r42 = $r2.value;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    boolean $z04 = this.isEditAvailable;
                    boolean $z1 = $r2.isEditAvailable;
                    if ($z04 != $z1) {
                        return false;
                    }
                    Fragment $r5 = this.fragment;
                    Fragment $r6 = $r2.fragment;
                    boolean $z05 = Log_OC.append($r5, $r6);
                    return $z05;
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
    public final Fragment getFragment() {
        Fragment r1 = this.fragment;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLabel() {
        String r1 = this.label;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getValue() {
        String r1 = this.value;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.label;
        int $i0 = $r1.hashCode();
        String $r12 = this.value;
        int $i1 = $r12.hashCode();
        int $i02 = (($i0 * 31) + $i1) * 31;
        boolean $z0 = this.isEditAvailable;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i12 = i;
        int $i03 = ($i02 + $i12) * 31;
        Fragment $r2 = this.fragment;
        int $i13 = $r2 == null ? 0 : $r2.hashCode();
        return $i03 + $i13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isEditAvailable() {
        boolean z0 = this.isEditAvailable;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("SummaryModel(label=");
        String $r1 = this.label;
        $r2.append($r1);
        $r2.append(", value=");
        String $r12 = this.value;
        $r2.append($r12);
        $r2.append(", isEditAvailable=");
        boolean $z0 = this.isEditAvailable;
        $r2.append($z0);
        $r2.append(", fragment=");
        Fragment $r3 = this.fragment;
        $r2.append($r3);
        $r2.append(')');
        String $r13 = $r2.toString();
        return $r13;
    }
}
