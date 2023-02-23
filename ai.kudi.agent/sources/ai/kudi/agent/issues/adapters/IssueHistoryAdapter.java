package ai.kudi.agent.issues.adapters;

import ai.kudi.agent.feature_issue_resolution.databinding.IssueHistoryItemBinding;
import ai.kudi.agent.issues.data.model.Issue;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueHistoryAdapter.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0014\u0010\u001a\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/IssueHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/issues/adapters/IssueHistoryViewHolder;", "()V", "issues", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "onClickListener", "Lkotlin/Function1;", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "addData", "tickets", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueHistoryAdapter extends RecyclerView.AbstractC1623h<IssueHistoryViewHolder> {
    private List<Issue.Ticket> issues;
    private InterfaceC11767l<? super Issue.Ticket, C13666w> onClickListener;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueHistoryAdapter() {
        ArrayList $r1 = new ArrayList();
        this.issues = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m39340onBindViewHolder$lambda0(IssueHistoryAdapter issueHistoryAdapter, int i, View view) {
        Log_OC.getArray(issueHistoryAdapter, "this$0");
        InterfaceC11767l $r2 = issueHistoryAdapter.getOnClickListener();
        Log_OC.append($r2);
        List $r3 = issueHistoryAdapter.issues;
        $r2.invoke($r3.get(i));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addData(List list) {
        Log_OC.getArray(list, "tickets");
        List $r2 = this.issues;
        $r2.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.issues;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnClickListener() {
        InterfaceC11767l r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(IssueHistoryViewHolder issueHistoryViewHolder, final int i) {
        Log_OC.getArray(issueHistoryViewHolder, "holder");
        List $r3 = this.issues;
        Object $r1 = $r3.get(i);
        Issue.Ticket $r4 = (Issue.Ticket) $r1;
        issueHistoryViewHolder.setData($r4);
        View $r5 = issueHistoryViewHolder.itemView;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.adapters.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueHistoryAdapter $r2 = IssueHistoryAdapter.this;
                int $i0 = i;
                IssueHistoryAdapter.m39340onBindViewHolder$lambda0($r2, $i0, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(IssueHistoryViewHolder issueHistoryViewHolder, int i) {
        IssueHistoryViewHolder $r2 = issueHistoryViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public IssueHistoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        LayoutInflater $r4 = LayoutInflater.from(viewGroup.getContext());
        IssueHistoryItemBinding $r5 = IssueHistoryItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        Context $r3 = viewGroup.getContext();
        Log_OC.loadImage($r3, "parent.context");
        IssueHistoryViewHolder $r2 = new IssueHistoryViewHolder($r5, $r3);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ IssueHistoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IssueHistoryViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "tickets");
        List $r2 = this.issues;
        $r2.clear();
        List $r22 = this.issues;
        $r22.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnClickListener(InterfaceC11767l interfaceC11767l) {
        this.onClickListener = interfaceC11767l;
    }
}
