package ai.kudi.agent.issues.adapters;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.issues.adapters.ResolutionMessageAdapter;
import ai.kudi.agent.issues.data.model.Issue;
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
import p590o.p591a.Timber;
/* compiled from: ResolutionMessageAdapter.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u001c\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0014\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "issueTypeList", "", "Lai/kudi/agent/issues/data/model/Issue$Comment;", "onClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function3;", "setOnClickListener", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCommentsList", AttributeType.LIST, "ResolutionViewHolder", "ViewHolder", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ResolutionMessageAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    private final Context context;
    private List<Issue.Comment> issueTypeList;
    private InterfaceC11772q<? super Issue.Comment, ? super View, ? super Integer, C13666w> onClickListener;

    /* compiled from: ResolutionMessageAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter$ResolutionViewHolder;", "Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter$ViewHolder;", "Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter;Landroid/view/View;)V", "commentAuthor", "Landroid/widget/TextView;", "getCommentAuthor", "()Landroid/widget/TextView;", "setCommentAuthor", "(Landroid/widget/TextView;)V", "resolutionMessage", "getResolutionMessage", "setResolutionMessage", "bindTransaction", "", "comment", "Lai/kudi/agent/issues/data/model/Issue$Comment;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class ResolutionViewHolder extends ViewHolder {
        private TextView commentAuthor;
        private TextView resolutionMessage;
        final /* synthetic */ ResolutionMessageAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public ResolutionViewHolder(ResolutionMessageAdapter resolutionMessageAdapter, View view) {
            super(resolutionMessageAdapter, view);
            Log_OC.getArray(resolutionMessageAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = resolutionMessageAdapter;
            int $i0 = C0214R.C0216id.resolutionMessageView;
            View $r3 = view.findViewById($i0);
            Log_OC.loadImage($r3, "container.findViewById(R.id.resolutionMessageView)");
            TextView $r4 = (TextView) $r3;
            this.resolutionMessage = $r4;
            int $i02 = C0214R.C0216id.commentAuthorText;
            View $r2 = view.findViewById($i02);
            Log_OC.loadImage($r2, "container.findViewById(R.id.commentAuthorText)");
            TextView $r42 = (TextView) $r2;
            this.commentAuthor = $r42;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.issues.adapters.ResolutionMessageAdapter.ViewHolder
        public void bindTransaction(Issue.Comment comment) {
            String $r3;
            Log_OC.getArray(comment, "comment");
            TextView $r2 = this.resolutionMessage;
            String $r32 = comment.getText();
            $r2.setText($r32);
            TextView $r22 = this.commentAuthor;
            String $r33 = comment.getAuthor();
            if ($r33 != null) {
                String $r34 = comment.getAuthor();
                $r3 = Log_OC.m10359a("~ ", (Object) $r34);
            } else {
                $r3 = "~ Kudi Support";
            }
            $r22.setText($r3);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getCommentAuthor() {
            TextView r1 = this.commentAuthor;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getResolutionMessage() {
            TextView r1 = this.resolutionMessage;
            return r1;
        }

        public final void setCommentAuthor(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.commentAuthor = textView;
        }

        public final void setResolutionMessage(TextView textView) {
            Log_OC.getArray(textView, "<set-?>");
            this.resolutionMessage = textView;
        }
    }

    /* compiled from: ResolutionMessageAdapter.kt */
    @Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J)\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/issues/adapters/ResolutionMessageAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindTransaction", "", "issueTypeModel", "Lai/kudi/agent/issues/data/model/Issue$Comment;", "setOnClickListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ ResolutionMessageAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ResolutionMessageAdapter resolutionMessageAdapter, View view) {
            super(view);
            Log_OC.getArray(resolutionMessageAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = resolutionMessageAdapter;
            this.container = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnClickListener$lambda-0  reason: not valid java name */
        public static final void m39342setOnClickListener$lambda0(InterfaceC11767l interfaceC11767l, View view) {
            Log_OC.getArray(interfaceC11767l, "$tmp0");
            interfaceC11767l.invoke(view);
        }

        public abstract void bindTransaction(Issue.Comment comment);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void setOnClickListener(final InterfaceC11767l interfaceC11767l) {
            Log_OC.getArray(interfaceC11767l, "listener");
            View $r3 = this.container;
            $r3.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.adapters.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC11767l $r2 = InterfaceC11767l.this;
                    ResolutionMessageAdapter.ViewHolder.m39342setOnClickListener$lambda0($r2, view);
                }
            });
        }
    }

    public ResolutionMessageAdapter(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.issueTypeList;
        Log_OC.append($r1);
        int $i0 = $r1.size();
        String $r2 = String.valueOf($i0);
        Object[] $r3 = new Object[0];
        Timber.m1627e($r2, $r3);
        List $r12 = this.issueTypeList;
        Log_OC.append($r12);
        int $i02 = $r12.size();
        return $i02;
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
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.issueTypeList;
        Log_OC.append($r3);
        Object $r2 = $r3.get(i);
        Issue.Comment $r4 = (Issue.Comment) $r2;
        viewHolder.bindTransaction($r4);
        ResolutionMessageAdapter$onBindViewHolder$1 $r5 = new ResolutionMessageAdapter$onBindViewHolder$1(this, viewHolder);
        viewHolder.setOnClickListener($r5);
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
        Context $r2 = this.context;
        LayoutInflater $r3 = LayoutInflater.from($r2);
        int $i0 = C0214R.C0217layout.resolution_messages_item;
        View $r4 = $r3.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r4, "view");
        ResolutionViewHolder $r5 = new ResolutionViewHolder(this, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setCommentsList(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        this.issueTypeList = list;
    }

    public final void setOnClickListener(InterfaceC11772q interfaceC11772q) {
        this.onClickListener = interfaceC11772q;
    }
}
