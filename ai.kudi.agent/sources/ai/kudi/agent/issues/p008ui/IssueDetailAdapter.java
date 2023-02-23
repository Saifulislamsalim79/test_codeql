package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.feature_issue_resolution.databinding.ContentTransactionHelpBinding;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.register.adapter.BaseViewHolder;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueTypeAdapterNew.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0014\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueDetailAdapter;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "context", "Landroid/content/Context;", "dropDownList", "", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", AttributeType.LIST, "Companion", "IssueDetailViewHolder", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueDetailAdapter */
/* loaded from: classes.dex */
public final class IssueDetailAdapter extends DynamicSearchAdapter<IssueTypeModel> {
    public static final Companion Companion;
    private static InterfaceC11767l<? super IssueTypeModel, C13666w> clickedListener;
    private final Context context;
    private List<IssueTypeModel> dropDownList;

    /* compiled from: IssueTypeAdapterNew.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueDetailAdapter$Companion;", "", "()V", "clickedListener", "Lkotlin/Function1;", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "", "getClickedListener", "()Lkotlin/jvm/functions/Function1;", "setClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueDetailAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11767l getClickedListener() {
            InterfaceC11767l $r1 = IssueDetailAdapter.clickedListener;
            return $r1;
        }

        public final void setClickedListener(InterfaceC11767l interfaceC11767l) {
            IssueDetailAdapter.clickedListener = interfaceC11767l;
        }
    }

    /* compiled from: IssueTypeAdapterNew.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueDetailAdapter$IssueDetailViewHolder;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "binding", "Lai/kudi/agent/feature_issue_resolution/databinding/ContentTransactionHelpBinding;", "(Lai/kudi/agent/feature_issue_resolution/databinding/ContentTransactionHelpBinding;)V", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/ContentTransactionHelpBinding;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueDetailAdapter$IssueDetailViewHolder */
    /* loaded from: classes.dex */
    public static final class IssueDetailViewHolder extends BaseViewHolder {
        private final ContentTransactionHelpBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public IssueDetailViewHolder(ai.kudi.agent.feature_issue_resolution.databinding.ContentTransactionHelpBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r5.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueDetailAdapter.IssueDetailViewHolder.<init>(ai.kudi.agent.feature_issue_resolution.databinding.ContentTransactionHelpBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ContentTransactionHelpBinding getBinding() {
            ContentTransactionHelpBinding r1 = this.binding;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueDetailAdapter(Context context, List list) {
        super(list);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "dropDownList");
        this.context = context;
        this.dropDownList = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IssueDetailAdapter(android.content.Context r4, java.util.List r5, int r6, kotlin.p483e0.p485d.DBUtils$1 r7) {
        /*
            r3 = this;
            r6 = r6 & 2
            if (r6 == 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = r0
            r0.<init>()
        La:
            r2 = r5
            java.util.List r2 = (java.util.List) r2
            r1 = r2
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueDetailAdapter.<init>(android.content.Context, java.util.List, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m39483onBindViewHolder$lambda0(IssueDetailAdapter issueDetailAdapter, int i, View view) {
        Log_OC.getArray(issueDetailAdapter, "this$0");
        InterfaceC11767l $r3 = clickedListener;
        if ($r3 == null) {
            return;
        }
        List $r4 = issueDetailAdapter.dropDownList;
        $r3.invoke($r4.get(i));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.dropDownList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(BaseViewHolder baseViewHolder, final int i) {
        Log_OC.getArray(baseViewHolder, "holder");
        IssueDetailViewHolder $r2 = (IssueDetailViewHolder) baseViewHolder;
        ContentTransactionHelpBinding $r3 = $r2.getBinding();
        TextView $r4 = $r3.titleTextView;
        List $r5 = this.dropDownList;
        Object $r6 = $r5.get(i);
        IssueTypeModel $r7 = (IssueTypeModel) $r6;
        CharSequence $r8 = $r7.getTitle();
        TextView r12 = $r4;
        r12.setText($r8);
        View $r9 = baseViewHolder.itemView;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueDetailAdapter $r22 = IssueDetailAdapter.this;
                int $i0 = i;
                IssueDetailAdapter.m39483onBindViewHolder$lambda0($r22, $i0, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        BaseViewHolder $r2 = baseViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ContentTransactionHelpBinding $r5 = ContentTransactionHelpBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(\n                    parent.context\n                ), parent, false\n            )");
        IssueDetailViewHolder $r2 = new IssueDetailViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        List $r2 = this.dropDownList;
        $r2.clear();
        List $r22 = this.dropDownList;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
