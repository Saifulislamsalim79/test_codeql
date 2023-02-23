package ai.kudi.agent.issues.adapters;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.feature_issue_resolution.databinding.IssueSummaryItemBinding;
import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueSummaryAdapter.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/IssueSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/issues/adapters/IssueSummaryAdapter$IssueSummaryViewHolder;", AttributeType.LIST, "", "Lai/kudi/agent/issues/adapters/IssueSummaryAdapter$DataToShow;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "addData", "", TransactionBreakDownItemType.DATA, "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataToShow", "IssueSummaryViewHolder", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueSummaryAdapter extends RecyclerView.AbstractC1623h<IssueSummaryViewHolder> {
    private final List<DataToShow> list;

    /* compiled from: IssueSummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/IssueSummaryAdapter$DataToShow;", "", KudiPin.KUDI_PIN_TITLE, "", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DataToShow {
        private final String subtitle;
        private final String title;

        public DataToShow(String str, String str2) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, "subtitle");
            this.title = str;
            this.subtitle = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ DataToShow copy$default(DataToShow dataToShow, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = dataToShow.title;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = dataToShow.subtitle;
            }
            DataToShow $r0 = dataToShow.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.title;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.subtitle;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DataToShow copy(String str, String str2) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, "subtitle");
            DataToShow $r0 = new DataToShow(str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof DataToShow;
            if ($z0) {
                DataToShow $r3 = (DataToShow) obj;
                String $r4 = this.title;
                String $r1 = $r3.title;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.subtitle;
                    String $r42 = $r3.subtitle;
                    boolean $z03 = Log_OC.append($r12, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getSubtitle() {
            String r1 = this.subtitle;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getTitle() {
            String r1 = this.title;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.title;
            int $i0 = $r1.hashCode();
            String $r12 = this.subtitle;
            int $i1 = $r12.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("DataToShow(title=");
            String $r1 = this.title;
            $r2.append($r1);
            $r2.append(", subtitle=");
            String $r12 = this.subtitle;
            $r2.append($r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    /* compiled from: IssueSummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/IssueSummaryAdapter$IssueSummaryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/feature_issue_resolution/databinding/IssueSummaryItemBinding;", "(Lai/kudi/agent/issues/adapters/IssueSummaryAdapter;Lai/kudi/agent/feature_issue_resolution/databinding/IssueSummaryItemBinding;)V", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/IssueSummaryItemBinding;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class IssueSummaryViewHolder extends RecyclerView.AbstractC1620e0 {
        private final IssueSummaryItemBinding binding;
        final /* synthetic */ IssueSummaryAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public IssueSummaryViewHolder(ai.kudi.agent.issues.adapters.IssueSummaryAdapter r3, ai.kudi.agent.feature_issue_resolution.databinding.IssueSummaryItemBinding r4) {
            /*
                r2 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
                r2.this$0 = r3
                android.widget.LinearLayout r1 = r4.getRoot()
                r2.<init>(r1)
                r2.binding = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.adapters.IssueSummaryAdapter.IssueSummaryViewHolder.<init>(ai.kudi.agent.issues.adapters.IssueSummaryAdapter, ai.kudi.agent.feature_issue_resolution.databinding.IssueSummaryItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final IssueSummaryItemBinding getBinding() {
            IssueSummaryItemBinding r1 = this.binding;
            return r1;
        }
    }

    public IssueSummaryAdapter(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        this.list = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addData(DataToShow dataToShow) {
        Log_OC.getArray(dataToShow, TransactionBreakDownItemType.DATA);
        List $r2 = this.list;
        $r2.add(dataToShow);
        notifyDataSetChanged();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.list;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getList() {
        List r1 = this.list;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(IssueSummaryViewHolder issueSummaryViewHolder, int i) {
        Log_OC.getArray(issueSummaryViewHolder, "holder");
        IssueSummaryItemBinding $r2 = issueSummaryViewHolder.getBinding();
        TextView $r3 = $r2.issueTitle;
        List $r4 = this.list;
        Object $r5 = $r4.get(i);
        DataToShow $r6 = (DataToShow) $r5;
        String $r7 = $r6.getTitle();
        Locale $r8 = Locale.US;
        Log_OC.loadImage($r8, "US");
        if ($r7 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r10;
        }
        CharSequence $r72 = $r7.toUpperCase($r8);
        Log_OC.loadImage($r72, "(this as java.lang.String).toUpperCase(locale)");
        TextView r11 = $r3;
        r11.setText($r72);
        IssueSummaryItemBinding $r22 = issueSummaryViewHolder.getBinding();
        TextView $r32 = $r22.issueDescription;
        List $r42 = this.list;
        Object $r52 = $r42.get(i);
        DataToShow $r62 = (DataToShow) $r52;
        TextView r112 = $r32;
        r112.setText($r62.getSubtitle());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(IssueSummaryViewHolder issueSummaryViewHolder, int i) {
        IssueSummaryViewHolder $r2 = issueSummaryViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public IssueSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        IssueSummaryItemBinding $r5 = IssueSummaryItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        IssueSummaryViewHolder $r2 = new IssueSummaryViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ IssueSummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IssueSummaryViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
