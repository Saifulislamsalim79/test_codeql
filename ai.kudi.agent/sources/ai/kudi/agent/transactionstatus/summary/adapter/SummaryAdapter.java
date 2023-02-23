package ai.kudi.agent.transactionstatus.summary.adapter;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.transactionstatus.summary.adapter.SummaryAdapter;
import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SummaryAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0014\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter$SummaryViewHolder;", "()V", "mSummaryModelList", "", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "onClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSummaryList", AttributeType.LIST, "SummaryViewHolder", "ViewHolder", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SummaryAdapter extends RecyclerView.AbstractC1623h<SummaryViewHolder> {
    private List<SummaryModel> mSummaryModelList;
    private InterfaceC11772q<? super SummaryModel, ? super View, ? super Integer, C13666w> onClickListener;

    /* compiled from: SummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter$SummaryViewHolder;", "Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter$ViewHolder;", "Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter;Landroid/view/View;)V", "editableTextView", "Landroid/widget/TextView;", "getEditableTextView", "()Landroid/widget/TextView;", "labelTextView", "valueTextView", "bind", "", "summaryModel", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class SummaryViewHolder extends ViewHolder {
        private final TextView editableTextView;
        private final TextView labelTextView;
        final /* synthetic */ SummaryAdapter this$0;
        private final TextView valueTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public SummaryViewHolder(SummaryAdapter summaryAdapter, View view) {
            super(summaryAdapter, view);
            Log_OC.getArray(summaryAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = summaryAdapter;
            int $i0 = C0038R.C0040id.labelTextView;
            View $r3 = view.findViewById($i0);
            Log_OC.loadImage($r3, "container.findViewById(R.id.labelTextView)");
            TextView $r4 = (TextView) $r3;
            this.labelTextView = $r4;
            int $i02 = C0038R.C0040id.valueTextView;
            View $r32 = view.findViewById($i02);
            Log_OC.loadImage($r32, "container.findViewById(R.id.valueTextView)");
            TextView $r42 = (TextView) $r32;
            this.valueTextView = $r42;
            int $i03 = C0038R.C0040id.editLabelTextView;
            View $r2 = view.findViewById($i03);
            Log_OC.loadImage($r2, "container.findViewById(R.id.editLabelTextView)");
            TextView $r43 = (TextView) $r2;
            this.editableTextView = $r43;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.transactionstatus.summary.adapter.SummaryAdapter.ViewHolder
        public void bind(SummaryModel summaryModel) {
            Log_OC.getArray(summaryModel, "summaryModel");
            TextView $r2 = this.labelTextView;
            String $r3 = summaryModel.getLabel();
            $r2.setText($r3);
            TextView $r22 = this.valueTextView;
            String $r32 = summaryModel.getValue();
            $r22.setText($r32);
            TextView $r23 = this.editableTextView;
            boolean $z0 = summaryModel.isEditAvailable();
            byte $b0 = $z0 ? (byte) 0 : (byte) 4;
            $r23.setVisibility($b0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getEditableTextView() {
            TextView r1 = this.editableTextView;
            return r1;
        }
    }

    /* compiled from: SummaryAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/transactionstatus/summary/adapter/SummaryAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bind", "", "summaryModel", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ SummaryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(SummaryAdapter summaryAdapter, View view) {
            super(view);
            Log_OC.getArray(summaryAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = summaryAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m41280setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bind(SummaryModel summaryModel);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final View getContainer() {
            View r1 = this.container;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setOnClickListener(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "listener");
            View $r3 = this.container;
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionstatus.summary.adapter.FloatingActionButton$3
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    SummaryAdapter.ViewHolder.m41280setOnClickListener$lambda0($r2, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m41279onBindViewHolder$lambda0(SummaryAdapter summaryAdapter, SummaryViewHolder summaryViewHolder, View view) {
        InterfaceC11772q $r3;
        Log_OC.getArray(summaryAdapter, "this$0");
        Log_OC.getArray(summaryViewHolder, "$holder");
        if (summaryAdapter.getOnClickListener() == null || ($r3 = summaryAdapter.getOnClickListener()) == null) {
            return;
        }
        List $r4 = summaryAdapter.mSummaryModelList;
        Log_OC.append($r4);
        int $i0 = summaryViewHolder.getAdapterPosition();
        SummaryModel summaryModel = $r4.get($i0);
        Log_OC.loadImage(view, "v");
        int $i02 = summaryViewHolder.getAdapterPosition();
        Integer $r6 = Integer.valueOf($i02);
        $r3.invoke(summaryModel, view, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.mSummaryModelList;
        Log_OC.append($r1);
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getOnClickListener() {
        InterfaceC11772q r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(final SummaryViewHolder summaryViewHolder, int i) {
        Log_OC.getArray(summaryViewHolder, "holder");
        List $r2 = this.mSummaryModelList;
        Log_OC.append($r2);
        Object $r3 = $r2.get(i);
        SummaryModel $r4 = (SummaryModel) $r3;
        summaryViewHolder.bind($r4);
        TextView $r5 = summaryViewHolder.getEditableTextView();
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionstatus.summary.adapter.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummaryAdapter $r22 = SummaryAdapter.this;
                SummaryAdapter.SummaryViewHolder $r32 = summaryViewHolder;
                SummaryAdapter.m41279onBindViewHolder$lambda0($r22, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(SummaryViewHolder summaryViewHolder, int i) {
        SummaryViewHolder $r2 = summaryViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public SummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C0038R.C0041layout.custom_voucher_creation_listing;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r4, "view");
        SummaryViewHolder $r5 = new SummaryViewHolder(this, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ SummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SummaryViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }

    public final void setSummaryList(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        this.mSummaryModelList = list;
    }
}
