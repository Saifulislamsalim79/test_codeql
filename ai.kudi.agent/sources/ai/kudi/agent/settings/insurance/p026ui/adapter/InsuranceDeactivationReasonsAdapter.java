package ai.kudi.agent.settings.insurance.p026ui.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel;
import ai.kudi.agent.settings.insurance.p026ui.adapter.InsuranceDeactivationReasonsAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: InsuranceDeactivationReasonsAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lai/kudi/agent/settings/insurance/data/InsuranceDeactivationReasonUiModel;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.adapter.InsuranceDeactivationReasonsAdapter */
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonsAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    private List<InsuranceDeactivationReasonUiModel> items;
    private final InterfaceC11767l<InsuranceDeactivationReasonUiModel, C13666w> onItemClicked;

    /* compiled from: InsuranceDeactivationReasonsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter;Landroid/view/View;)V", "reasonSelectionIcon", "Landroid/widget/ImageView;", "getReasonSelectionIcon", "()Landroid/widget/ImageView;", "setReasonSelectionIcon", "(Landroid/widget/ImageView;)V", "reasonTextView", "Landroid/widget/TextView;", "getReasonTextView", "()Landroid/widget/TextView;", "setReasonTextView", "(Landroid/widget/TextView;)V", "bindData", "", "reason", "Lai/kudi/agent/settings/insurance/data/InsuranceDeactivationReasonUiModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.insurance.ui.adapter.InsuranceDeactivationReasonsAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public final class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private ImageView reasonSelectionIcon;
        private TextView reasonTextView;
        final /* synthetic */ InsuranceDeactivationReasonsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ViewHolder(InsuranceDeactivationReasonsAdapter insuranceDeactivationReasonsAdapter, View view) {
            super(view);
            Log_OC.getArray(insuranceDeactivationReasonsAdapter, "this$0");
            Log_OC.getArray(view, "itemView");
            this.this$0 = insuranceDeactivationReasonsAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.selection_image_view);
            Log_OC.loadImage($r3, "itemView.findViewById(R.id.selection_image_view)");
            ImageView $r4 = (ImageView) $r3;
            this.reasonSelectionIcon = $r4;
            View $r2 = view.findViewById(C0001R.C0003id.reason_text_view);
            Log_OC.loadImage($r2, "itemView.findViewById(R.id.reason_text_view)");
            TextView $r5 = (TextView) $r2;
            this.reasonTextView = $r5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-0  reason: not valid java name */
        public static final void m40793bindData$lambda0(InsuranceDeactivationReasonsAdapter insuranceDeactivationReasonsAdapter, InsuranceDeactivationReasonUiModel insuranceDeactivationReasonUiModel, View view) {
            Log_OC.getArray(insuranceDeactivationReasonsAdapter, "this$0");
            Log_OC.getArray(insuranceDeactivationReasonUiModel, "$reason");
            InterfaceC11767l $r1 = insuranceDeactivationReasonsAdapter.onItemClicked;
            $r1.invoke(insuranceDeactivationReasonUiModel);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bindData(final InsuranceDeactivationReasonUiModel insuranceDeactivationReasonUiModel) {
            Log_OC.getArray(insuranceDeactivationReasonUiModel, "reason");
            boolean $z0 = insuranceDeactivationReasonUiModel.isSelected();
            if ($z0) {
                ImageView $r3 = this.reasonSelectionIcon;
                $r3.setColorFilter(C0001R.color.kudiLightBlue);
            } else {
                ImageView $r32 = this.reasonSelectionIcon;
                $r32.clearColorFilter();
            }
            TextView $r4 = this.reasonTextView;
            String $r5 = insuranceDeactivationReasonUiModel.getReasonText();
            $r4.setText($r5);
            View $r6 = this.itemView;
            final InsuranceDeactivationReasonsAdapter $r7 = this.this$0;
            $r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.insurance.ui.adapter.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InsuranceDeactivationReasonsAdapter $r2 = InsuranceDeactivationReasonsAdapter.this;
                    InsuranceDeactivationReasonUiModel $r33 = insuranceDeactivationReasonUiModel;
                    InsuranceDeactivationReasonsAdapter.ViewHolder.m40793bindData$lambda0($r2, $r33, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ImageView getReasonSelectionIcon() {
            ImageView r1 = this.reasonSelectionIcon;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getReasonTextView() {
            TextView r1 = this.reasonTextView;
            return r1;
        }

        public final void setReasonSelectionIcon(ImageView imageView) {
            Log_OC.getArray(imageView, "<set-?>");
            this.reasonSelectionIcon = imageView;
        }

        public final void setReasonTextView(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.reasonTextView = textView;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InsuranceDeactivationReasonsAdapter(InterfaceC11767l interfaceC11767l) {
        List $r1;
        Log_OC.getArray(interfaceC11767l, "onItemClicked");
        this.onItemClicked = interfaceC11767l;
        $r1 = C13726r.m3891e();
        this.items = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getItems() {
        List r1 = this.items;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.items;
        Object $r2 = $r3.get(i);
        InsuranceDeactivationReasonUiModel $r4 = (InsuranceDeactivationReasonUiModel) $r2;
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
        View $r5 = $r4.inflate(C0001R.C0004layout.list_item_deactivate_insurance_reason, viewGroup, false);
        Log_OC.loadImage($r5, "inflater.inflate(R.layout.list_item_deactivate_insurance_reason, parent, false)");
        ViewHolder $r1 = new ViewHolder(this, $r5);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setItems(List list) {
        Log_OC.getArray(list, "value");
        this.items = list;
        notifyDataSetChanged();
    }
}
