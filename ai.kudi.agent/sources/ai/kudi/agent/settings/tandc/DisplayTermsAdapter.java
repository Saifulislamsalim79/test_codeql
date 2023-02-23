package ai.kudi.agent.settings.tandc;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.ItemTermsConditionBinding;
import ai.kudi.agent.settings.tandc.DisplayTermsAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: DisplayTermsAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\t2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/settings/tandc/DisplayTermsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/tandc/DisplayTermsAdapter$ViewHolder;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listener", "Lkotlin/Function1;", "", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "tcList", "", "Lai/kudi/agent/settings/tandc/NombaTerms;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DisplayTermsAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    public static final String GENERAL_TERM = "file:///android_asset/html/kudi_terms.html";
    public static final String LOAN_TERM = "file:///android_asset/html/kshock_terms.html";
    public static final String SAVING_TERM = "file:///android_asset/SavingsTermsAndConditions.html";
    private InterfaceC11767l<? super String, C13666w> listener;
    private final List<NombaTerms> tcList;

    /* compiled from: DisplayTermsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/tandc/DisplayTermsAdapter$Companion;", "", "()V", "GENERAL_TERM", "", "LOAN_TERM", "SAVING_TERM", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: DisplayTermsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/tandc/DisplayTermsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/ItemTermsConditionBinding;", "(Lai/kudi/agent/settings/tandc/DisplayTermsAdapter;Lai/kudi/agent/databinding/ItemTermsConditionBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/ItemTermsConditionBinding;", "bindData", "", "term", "Lai/kudi/agent/settings/tandc/NombaTerms;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final ItemTermsConditionBinding binding;
        final /* synthetic */ DisplayTermsAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(ai.kudi.agent.settings.tandc.DisplayTermsAdapter r5, ai.kudi.agent.databinding.ItemTermsConditionBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.tandc.DisplayTermsAdapter.ViewHolder.<init>(ai.kudi.agent.settings.tandc.DisplayTermsAdapter, ai.kudi.agent.databinding.ItemTermsConditionBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-0  reason: not valid java name */
        public static final void m40898bindData$lambda0(DisplayTermsAdapter displayTermsAdapter, NombaTerms nombaTerms, View view) {
            Log_OC.getArray(displayTermsAdapter, "this$0");
            Log_OC.getArray(nombaTerms, "$term");
            InterfaceC11767l $r3 = displayTermsAdapter.getListener();
            if ($r3 == null) {
                return;
            }
            String $r4 = nombaTerms.getTermsLink();
            $r3.invoke($r4);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bindData(final NombaTerms nombaTerms) {
            Log_OC.getArray(nombaTerms, "term");
            ItemTermsConditionBinding $r4 = this.binding;
            TextView $r5 = $r4.tvTermsName;
            CharSequence $r3 = nombaTerms.getTermName();
            TextView r9 = $r5;
            r9.setText($r3);
            View $r6 = this.itemView;
            final DisplayTermsAdapter $r7 = this.this$0;
            $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.tandc.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DisplayTermsAdapter $r2 = DisplayTermsAdapter.this;
                    NombaTerms $r32 = nombaTerms;
                    DisplayTermsAdapter.ViewHolder.m40898bindData$lambda0($r2, $r32, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemTermsConditionBinding getBinding() {
            ItemTermsConditionBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DisplayTermsAdapter(Context context) {
        List $r5;
        Log_OC.getArray(context, "ctx");
        String $r4 = context.getString(C0001R.string.general_term);
        Log_OC.loadImage($r4, "ctx.getString(R.string.general_term)");
        NombaTerms $r3 = new NombaTerms($r4, GENERAL_TERM);
        String $r42 = context.getString(C0001R.string.loan_term);
        Log_OC.loadImage($r42, "ctx.getString(R.string.loan_term)");
        NombaTerms $r32 = new NombaTerms($r42, LOAN_TERM);
        String $r43 = context.getString(C0001R.string.saving_term);
        Log_OC.loadImage($r43, "ctx.getString(R.string.saving_term)");
        NombaTerms $r33 = new NombaTerms($r43, SAVING_TERM);
        NombaTerms[] $r2 = {$r3, $r32, $r33};
        $r5 = C13726r.m3888h($r2);
        this.tcList = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.tcList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getListener() {
        InterfaceC11767l r1 = this.listener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.tcList;
        Object $r2 = $r3.get(i);
        NombaTerms $r4 = (NombaTerms) $r2;
        viewHolder.bindData($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemTermsConditionBinding $r5 = ItemTermsConditionBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        ViewHolder $r2 = new ViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setListener(InterfaceC11767l interfaceC11767l) {
        this.listener = interfaceC11767l;
    }
}
