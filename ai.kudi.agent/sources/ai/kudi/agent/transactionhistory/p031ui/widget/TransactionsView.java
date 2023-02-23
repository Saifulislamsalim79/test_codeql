package ai.kudi.agent.transactionhistory.p031ui.widget;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionSummaryAdapter;
import ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsAdapter;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionsView.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020U2\b\b\u0002\u0010V\u001a\u00020WJ\b\u0010X\u001a\u00020 H\u0002J\b\u0010Y\u001a\u00020 H\u0002J\b\u0010Z\u001a\u00020 H\u0016J\b\u0010[\u001a\u00020 H\u0002R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\rR#\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\rR#\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001c\u0010\rR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020 0&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001b\u00100\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u00103R#\u00105\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b6\u0010\rR#\u00108\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b9\u0010\rR#\u0010;\u001a\n \u000b*\u0004\u0018\u00010<0<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u000f\u001a\u0004\b=\u0010>R#\u0010@\u001a\n \u000b*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u000f\u001a\u0004\bB\u0010CR\u000e\u0010E\u001a\u00020FX\u0082.¢\u0006\u0002\n\u0000R(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010G\u001a\u0004\u0018\u00010H8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR#\u0010N\u001a\n \u000b*\u0004\u0018\u00010O0O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u000f\u001a\u0004\bP\u0010Q¨\u0006\\"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/widget/TransactionsView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emptyStateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getEmptyStateView", "()Landroid/view/View;", "emptyStateView$delegate", "Lkotlin/Lazy;", "incompleteTransactionsButton", "Landroid/widget/Button;", "getIncompleteTransactionsButton", "()Landroid/widget/Button;", "incompleteTransactionsButton$delegate", "incompleteTransactionsIndicator", "getIncompleteTransactionsIndicator", "incompleteTransactionsIndicator$delegate", "listLoaderView", "getListLoaderView", "listLoaderView$delegate", "nextProgressBar", "getNextProgressBar", "nextProgressBar$delegate", "onLoadMore", "Lkotlin/Function0;", "", "getOnLoadMore", "()Lkotlin/jvm/functions/Function0;", "setOnLoadMore", "(Lkotlin/jvm/functions/Function0;)V", "onSummaryItemClicked", "Lkotlin/Function1;", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "getOnSummaryItemClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSummaryItemClicked", "(Lkotlin/jvm/functions/Function1;)V", "onTransactionItemClicked", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "getOnTransactionItemClicked", "setOnTransactionItemClicked", "searchField", "Landroid/widget/EditText;", "getSearchField", "()Landroid/widget/EditText;", "searchField$delegate", "summary", "getSummary", "summary$delegate", "summaryLoaderView", "getSummaryLoaderView", "summaryLoaderView$delegate", "summaryPager", "Landroidx/viewpager/widget/ViewPager;", "getSummaryPager", "()Landroidx/viewpager/widget/ViewPager;", "summaryPager$delegate", "transactionList", "Landroidx/recyclerview/widget/RecyclerView;", "getTransactionList", "()Landroidx/recyclerview/widget/RecyclerView;", "transactionList$delegate", "transactionsAdapter", "Lai/kudi/agent/transactionhistory/ui/adapter/TransactionsAdapter;", "value", "", "warningText", "getWarningText", "()Ljava/lang/String;", "setWarningText", "(Ljava/lang/String;)V", "warningTextView", "Landroid/widget/TextView;", "getWarningTextView", "()Landroid/widget/TextView;", "warningTextView$delegate", "bindData", "viewData", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "isFiltering", "", "handleInfiniteScrolling", "hideSummary", "onAttachedToWindow", "setupTransactionsAdapter", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.widget.TransactionsView */
/* loaded from: classes.dex */
public final class TransactionsView extends NestedScrollView {
    private final InterfaceC11824h emptyStateView$delegate;
    private final InterfaceC11824h incompleteTransactionsButton$delegate;
    private final InterfaceC11824h incompleteTransactionsIndicator$delegate;
    private final InterfaceC11824h listLoaderView$delegate;
    private final InterfaceC11824h nextProgressBar$delegate;
    private InterfaceC11756a<C13666w> onLoadMore;
    private InterfaceC11767l<? super TransactionSummaryItem, C13666w> onSummaryItemClicked;
    private InterfaceC11767l<? super TransactionItemUiModel.Transaction, C13666w> onTransactionItemClicked;
    private final InterfaceC11824h searchField$delegate;
    private final InterfaceC11824h summary$delegate;
    private final InterfaceC11824h summaryLoaderView$delegate;
    private final InterfaceC11824h summaryPager$delegate;
    private final InterfaceC11824h transactionList$delegate;
    private TransactionsAdapter transactionsAdapter;
    private final InterfaceC11824h warningTextView$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionsView(Context context) {
        this(context, null, 0, 6, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransactionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Log_OC.getArray(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC11824h $r4;
        InterfaceC11824h $r42;
        InterfaceC11824h $r43;
        InterfaceC11824h $r44;
        InterfaceC11824h $r45;
        InterfaceC11824h $r46;
        InterfaceC11824h $r47;
        InterfaceC11824h $r48;
        InterfaceC11824h $r49;
        InterfaceC11824h $r410;
        InterfaceC11824h $r411;
        Log_OC.getArray(context, "context");
        TransactionsView$transactionList$2 r18 = new TransactionsView$transactionList$2(this);
        $r4 = C13218k.m5625b(r18);
        this.transactionList$delegate = $r4;
        TransactionsView$searchField$2 r19 = new TransactionsView$searchField$2(this);
        $r42 = C13218k.m5625b(r19);
        this.searchField$delegate = $r42;
        TransactionsView$summaryLoaderView$2 r20 = new TransactionsView$summaryLoaderView$2(this);
        $r43 = C13218k.m5625b(r20);
        this.summaryLoaderView$delegate = $r43;
        TransactionsView$summary$2 r21 = new TransactionsView$summary$2(this);
        $r44 = C13218k.m5625b(r21);
        this.summary$delegate = $r44;
        TransactionsView$listLoaderView$2 r22 = new TransactionsView$listLoaderView$2(this);
        $r45 = C13218k.m5625b(r22);
        this.listLoaderView$delegate = $r45;
        TransactionsView$summaryPager$2 r23 = new TransactionsView$summaryPager$2(this);
        $r46 = C13218k.m5625b(r23);
        this.summaryPager$delegate = $r46;
        TransactionsView$emptyStateView$2 r24 = new TransactionsView$emptyStateView$2(this);
        $r47 = C13218k.m5625b(r24);
        this.emptyStateView$delegate = $r47;
        TransactionsView$nextProgressBar$2 r25 = new TransactionsView$nextProgressBar$2(this);
        $r48 = C13218k.m5625b(r25);
        this.nextProgressBar$delegate = $r48;
        TransactionsView$warningTextView$2 r26 = new TransactionsView$warningTextView$2(this);
        $r49 = C13218k.m5625b(r26);
        this.warningTextView$delegate = $r49;
        TransactionsView$incompleteTransactionsButton$2 r27 = new TransactionsView$incompleteTransactionsButton$2(this);
        $r410 = C13218k.m5625b(r27);
        this.incompleteTransactionsButton$delegate = $r410;
        TransactionsView$incompleteTransactionsIndicator$2 r28 = new TransactionsView$incompleteTransactionsIndicator$2(this);
        $r411 = C13218k.m5625b(r28);
        this.incompleteTransactionsIndicator$delegate = $r411;
        TransactionsView$onSummaryItemClicked$1 $r15 = TransactionsView$onSummaryItemClicked$1.INSTANCE;
        this.onSummaryItemClicked = $r15;
        TransactionsView$onTransactionItemClicked$1 $r16 = TransactionsView$onTransactionItemClicked$1.INSTANCE;
        this.onTransactionItemClicked = $r16;
        TransactionsView$onLoadMore$1 $r17 = TransactionsView$onLoadMore$1.INSTANCE;
        this.onLoadMore = $r17;
        TransactionsView r29 = this;
        View.inflate(context, C0001R.C0004layout.view_transactions, r29);
        setupTransactionsAdapter();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TransactionsView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void bindData$default(TransactionsView transactionsView, TransactionsViewState transactionsViewState, boolean $z0, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionsView.bindData(transactionsViewState, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getEmptyStateView() {
        InterfaceC11824h $r2 = this.emptyStateView$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getIncompleteTransactionsIndicator() {
        InterfaceC11824h $r2 = this.incompleteTransactionsIndicator$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getListLoaderView() {
        InterfaceC11824h $r2 = this.listLoaderView$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getNextProgressBar() {
        InterfaceC11824h $r2 = this.nextProgressBar$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getSummary() {
        InterfaceC11824h $r2 = this.summary$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final View getSummaryLoaderView() {
        InterfaceC11824h $r2 = this.summaryLoaderView$delegate;
        Object $r1 = $r2.getValue();
        View $r3 = (View) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ViewPager getSummaryPager() {
        InterfaceC11824h $r2 = this.summaryPager$delegate;
        Object $r1 = $r2.getValue();
        ViewPager $r3 = (ViewPager) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final RecyclerView getTransactionList() {
        InterfaceC11824h $r2 = this.transactionList$delegate;
        Object $r1 = $r2.getValue();
        RecyclerView $r3 = (RecyclerView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getWarningText() {
        TextView $r1 = getWarningTextView();
        CharSequence $r2 = $r1.getText();
        String $r3 = $r2.toString();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final TextView getWarningTextView() {
        InterfaceC11824h $r2 = this.warningTextView$delegate;
        Object $r1 = $r2.getValue();
        TextView $r3 = (TextView) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleInfiniteScrolling() {
        setOnScrollChangeListener(new NestedScrollView.InterfaceC1385b() { // from class: ai.kudi.agent.transactionhistory.ui.widget.AlertController$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                TransactionsView $r2 = TransactionsView.this;
                TransactionsView.m41087handleInfiniteScrolling$lambda0($r2, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleInfiniteScrolling$lambda-0  reason: not valid java name */
    public static final void m41087handleInfiniteScrolling$lambda0(TransactionsView transactionsView, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Log_OC.getArray(transactionsView, "this$0");
        Log_OC.getArray(nestedScrollView, "v");
        NestedScrollView r4 = nestedScrollView;
        int $i3 = r4.getChildCount();
        NestedScrollView r42 = nestedScrollView;
        View $r2 = r42.getChildAt($i3 - 1);
        int $i32 = $r2.getBottom();
        NestedScrollView r43 = nestedScrollView;
        int $i1 = r43.getHeight();
        int $i33 = $i32 - ($i1 + i2);
        if (i2 <= i4 || $i33 > 0) {
            return;
        }
        InterfaceC11756a $r3 = transactionsView.getOnLoadMore();
        $r3.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideSummary() {
        View $r1 = getSummary();
        Log_OC.loadImage($r1, "summary");
        ViewExtKt.hide$default($r1, false, 1, null);
        Button $r2 = getIncompleteTransactionsButton();
        ViewExtKt.hide$default($r2, false, 1, null);
        View $r12 = getIncompleteTransactionsIndicator();
        Log_OC.loadImage($r12, "incompleteTransactionsIndicator");
        ViewExtKt.hide$default($r12, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setWarningText(java.lang.String r7) {
        /*
            r6 = this;
            android.widget.TextView r0 = r6.getWarningTextView()
            r0.setText(r7)
            if (r7 == 0) goto L12
            boolean r1 = kotlin.p549l0.C13265j.m5470u(r7)
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L25
            android.widget.TextView r0 = r6.getWarningTextView()
            java.lang.String r2 = "warningTextView"
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r2)
            r3 = 0
            r4 = 1
            r5 = 0
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r0, r3, r4, r5)
            return
        L25:
            android.widget.TextView r0 = r6.getWarningTextView()
            java.lang.String r2 = "warningTextView"
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r2)
            ai.kudi.agent.core.util.ViewExtKt.show(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.p031ui.widget.TransactionsView.setWarningText(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupTransactionsAdapter() {
        TransactionsView$setupTransactionsAdapter$1 r7 = new TransactionsView$setupTransactionsAdapter$1(this);
        TransactionsAdapter r8 = new TransactionsAdapter(r7);
        this.transactionsAdapter = r8;
        RecyclerView $r3 = getTransactionList();
        TransactionsView r10 = this;
        Context $r5 = r10.getContext();
        LinearLayoutManager r9 = new LinearLayoutManager($r5);
        $r3.setLayoutManager(r9);
        RecyclerView $r32 = getTransactionList();
        TransactionsAdapter $r1 = this.transactionsAdapter;
        if ($r1 != null) {
            $r32.setAdapter($r1);
            return;
        }
        Log_OC.LogError("transactionsAdapter");
        NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
        throw r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bindData(TransactionsViewState transactionsViewState, boolean z) {
        Log_OC.getArray(transactionsViewState, "viewData");
        boolean $z1 = transactionsViewState.getShowEmptyListView();
        if ($z1) {
            View $r2 = getEmptyStateView();
            Log_OC.loadImage($r2, "emptyStateView");
            ViewExtKt.show($r2);
        } else {
            View $r22 = getEmptyStateView();
            Log_OC.loadImage($r22, "emptyStateView");
            ViewExtKt.hide$default($r22, false, 1, null);
        }
        boolean $z12 = transactionsViewState.isLoadingTransactions();
        if ($z12) {
            View $r23 = getListLoaderView();
            Log_OC.loadImage($r23, "listLoaderView");
            ViewExtKt.show($r23);
            EditText $r3 = getSearchField();
            ViewExtKt.hide$default($r3, false, 1, null);
            View $r4 = getTransactionList();
            Log_OC.loadImage($r4, "transactionList");
            ViewExtKt.hide$default($r4, false, 1, null);
        } else {
            View $r24 = getListLoaderView();
            Log_OC.loadImage($r24, "listLoaderView");
            ViewExtKt.hide$default($r24, false, 1, null);
            View $r42 = getTransactionList();
            Log_OC.loadImage($r42, "transactionList");
            ViewExtKt.show($r42);
            boolean $z13 = transactionsViewState.getHideSummary();
            if ($z13) {
                View $r25 = getSummary();
                Log_OC.loadImage($r25, "summary");
                ViewExtKt.hide$default($r25, false, 1, null);
                Button $r5 = getIncompleteTransactionsButton();
                ViewExtKt.hide$default($r5, false, 1, null);
                View $r26 = getIncompleteTransactionsIndicator();
                Log_OC.loadImage($r26, "incompleteTransactionsIndicator");
                ViewExtKt.hide$default($r26, false, 1, null);
                EditText $r32 = getSearchField();
                ViewExtKt.hide$default($r32, false, 1, null);
            } else {
                View $r27 = getSummary();
                Log_OC.loadImage($r27, "summary");
                ViewExtKt.show($r27);
                Button $r52 = getIncompleteTransactionsButton();
                ViewExtKt.show($r52);
                View $r28 = getIncompleteTransactionsIndicator();
                Log_OC.loadImage($r28, "incompleteTransactionsIndicator");
                ViewExtKt.show($r28);
                EditText $r33 = getSearchField();
                ViewExtKt.show($r33);
            }
        }
        if (z) {
            hideSummary();
        } else {
            EditText $r34 = getSearchField();
            ViewExtKt.hide$default($r34, false, 1, null);
        }
        boolean $z14 = transactionsViewState.isLoadingMore();
        if ($z14) {
            View $r29 = getNextProgressBar();
            Log_OC.loadImage($r29, "nextProgressBar");
            ViewExtKt.show($r29);
        } else {
            View $r210 = getNextProgressBar();
            Log_OC.loadImage($r210, "nextProgressBar");
            ViewExtKt.hide$default($r210, false, 1, null);
        }
        boolean $z15 = transactionsViewState.isLoadingSummary();
        if (!$z15 || z) {
            View $r211 = getSummaryLoaderView();
            Log_OC.loadImage($r211, "summaryLoaderView");
            ViewExtKt.hide$default($r211, false, 1, null);
            View $r6 = getSummaryPager();
            Log_OC.loadImage($r6, "summaryPager");
            ViewExtKt.show($r6);
        } else {
            View $r212 = getSummaryLoaderView();
            Log_OC.loadImage($r212, "summaryLoaderView");
            ViewExtKt.show($r212);
            View $r62 = getSummaryPager();
            Log_OC.loadImage($r62, "summaryPager");
            ViewExtKt.hide$default($r62, false, 1, null);
        }
        int $i0 = transactionsViewState.getIncompleteTransactionsCount();
        if ($i0 > 0) {
            Button $r53 = getIncompleteTransactionsButton();
            TransactionsView r18 = this;
            Context $r7 = r18.getContext();
            int $i02 = transactionsViewState.getIncompleteTransactionsCount();
            Integer $r9 = Integer.valueOf($i02);
            Object[] $r8 = {$r9};
            String $r10 = $r7.getString(C0001R.string.you_have_x_incomplete_transactions, $r8);
            $r53.setText($r10);
            Button $r54 = getIncompleteTransactionsButton();
            ViewExtKt.show($r54);
            View $r213 = getIncompleteTransactionsIndicator();
            Log_OC.loadImage($r213, "incompleteTransactionsIndicator");
            ViewExtKt.show($r213);
        } else {
            Button $r55 = getIncompleteTransactionsButton();
            ViewExtKt.hide$default($r55, false, 1, null);
            View $r214 = getIncompleteTransactionsIndicator();
            Log_OC.loadImage($r214, "incompleteTransactionsIndicator");
            ViewExtKt.hide$default($r214, false, 1, null);
        }
        String $r102 = transactionsViewState.getWarningText();
        setWarningText($r102);
        TransactionsAdapter $r11 = this.transactionsAdapter;
        if ($r11 == null) {
            Log_OC.LogError("transactionsAdapter");
            NullPointerException r15 = new NullPointerException("Null throw statement replaced by Soot");
            throw r15;
        }
        List $r12 = transactionsViewState.getTransactions();
        $r11.setItems($r12);
        getSummaryPager().setAdapter(null);
        ViewPager $r63 = getSummaryPager();
        TransactionsView r182 = this;
        Context $r72 = r182.getContext();
        Log_OC.loadImage($r72, "context");
        List $r122 = transactionsViewState.getWalletSummary();
        TransactionsView$bindData$1 r16 = new TransactionsView$bindData$1(this);
        TransactionSummaryAdapter r17 = new TransactionSummaryAdapter($r72, $r122, r16);
        $r63.setAdapter(r17);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Button getIncompleteTransactionsButton() {
        InterfaceC11824h $r2 = this.incompleteTransactionsButton$delegate;
        Object $r1 = $r2.getValue();
        Log_OC.loadImage($r1, "<get-incompleteTransactionsButton>(...)");
        Button $r3 = (Button) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getOnLoadMore() {
        InterfaceC11756a r1 = this.onLoadMore;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnSummaryItemClicked() {
        InterfaceC11767l r1 = this.onSummaryItemClicked;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnTransactionItemClicked() {
        InterfaceC11767l r1 = this.onTransactionItemClicked;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final EditText getSearchField() {
        InterfaceC11824h $r2 = this.searchField$delegate;
        Object $r1 = $r2.getValue();
        Log_OC.loadImage($r1, "<get-searchField>(...)");
        EditText $r3 = (EditText) $r1;
        return $r3;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        handleInfiniteScrolling();
    }

    public final void setOnLoadMore(InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "<set-?>");
        this.onLoadMore = interfaceC11756a;
    }

    public final void setOnSummaryItemClicked(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onSummaryItemClicked = interfaceC11767l;
    }

    public final void setOnTransactionItemClicked(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onTransactionItemClicked = interfaceC11767l;
    }
}
