package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.issues.adapters.IssueTypeAdapter;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModelWithDuplicateChecker;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueTypeFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0016\u00106\u001a\u00020*2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001c¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueTypeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "globalNavigator", "Lai/kudi/agent/core/navigation/GlobalNavigator;", "getGlobalNavigator", "()Lai/kudi/agent/core/navigation/GlobalNavigator;", "setGlobalNavigator", "(Lai/kudi/agent/core/navigation/GlobalNavigator;)V", "issueTypeAdapter", "Lai/kudi/agent/issues/adapters/IssueTypeAdapter;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "ticketId", "", "getTicketId", "()Ljava/lang/String;", "setTicketId", "(Ljava/lang/String;)V", "ticketStatus", "getTicketStatus", "setTicketStatus", "transactionAmount", "getTransactionAmount", "setTransactionAmount", "transactionRef", "getTransactionRef", "setTransactionRef", "transactionType", "getTransactionType", "setTransactionType", "bindListView", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showHelperList", "helperList", "", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragment */
/* loaded from: classes.dex */
public final class IssueTypeFragment extends Fragment {
    public static final Companion Companion;
    public static final String HELP_LIST = "HELP_LIST";
    public static final String TEMP_TICKET_ID = "TEMP_TICKET_ID";
    public static final String TEMP_TICKET_PREFERENCE = "TEMP_TICKET_PREFERENCE";
    public static final String TRANSACTION_AMOUNT = "TRANSACTION_AMOUNT";
    public static final String TRANSACTION_ID = "TRANSACTION_ID";
    public static final String TRANSACTION_TYPE = "TRANSACTION_TYPE";
    public GlobalNavigator globalNavigator;
    private IssueTypeAdapter issueTypeAdapter;
    public LinearLayoutManager layoutManager;
    public RecyclerView recyclerView;
    private String ticketId = "";
    private String ticketStatus = "";
    private String transactionAmount;
    private String transactionRef;
    private String transactionType;

    /* compiled from: IssueTypeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueTypeFragment$Companion;", "", "()V", IssueTypeFragment.HELP_LIST, "", IssueTypeFragment.TEMP_TICKET_ID, IssueTypeFragment.TEMP_TICKET_PREFERENCE, IssueTypeFragment.TRANSACTION_AMOUNT, IssueTypeFragment.TRANSACTION_ID, IssueTypeFragment.TRANSACTION_TYPE, "newInstance", "Lai/kudi/agent/issues/ui/IssueTypeFragment;", "transactionId", TransactionField.AMOUNT, "transactionType", "issueTypeModelWithDuplicateChecker", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModelWithDuplicateChecker;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragment$Companion */
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
        public final IssueTypeFragment newInstance(String str, String str2, String str3, IssueTypeModelWithDuplicateChecker issueTypeModelWithDuplicateChecker) {
            Log_OC.getArray(issueTypeModelWithDuplicateChecker, "issueTypeModelWithDuplicateChecker");
            Bundle $r5 = new Bundle();
            $r5.putSerializable(IssueTypeFragment.HELP_LIST, issueTypeModelWithDuplicateChecker);
            $r5.putString(IssueTypeFragment.TRANSACTION_ID, str);
            $r5.putString(IssueTypeFragment.TRANSACTION_AMOUNT, str2);
            $r5.putString(IssueTypeFragment.TRANSACTION_TYPE, str3);
            IssueTypeFragment $r6 = new IssueTypeFragment();
            $r6.setArguments($r5);
            return $r6;
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
    private final void showHelperList(List list) {
        IssueTypeAdapter $r1 = this.issueTypeAdapter;
        if ($r1 == null) {
            Log_OC.LogError("issueTypeAdapter");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        $r1.setTransactionHelperList(list);
        ViewGroup $r2 = getRecyclerView();
        ViewGroup r5 = $r2;
        r5.invalidate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bindListView() {
        Context $r2 = getContext();
        LinearLayoutManager $r1 = new LinearLayoutManager($r2);
        setLayoutManager($r1);
        Context $r22 = requireContext();
        Context $r23 = $r22.getApplicationContext();
        Log_OC.loadImage($r23, "requireContext().applicationContext");
        IssueTypeAdapter $r3 = new IssueTypeAdapter($r23);
        this.issueTypeAdapter = $r3;
        if ($r3 == null) {
            Log_OC.LogError("issueTypeAdapter");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        IssueTypeFragment$bindListView$1 $r4 = new IssueTypeFragment$bindListView$1(this);
        $r3.setOnClickListener($r4);
        RecyclerView $r5 = getRecyclerView();
        LinearLayoutManager $r12 = getLayoutManager();
        $r5.setLayoutManager($r12);
        RecyclerView $r52 = getRecyclerView();
        IssueTypeAdapter $r32 = this.issueTypeAdapter;
        if ($r32 == null) {
            Log_OC.LogError("issueTypeAdapter");
            NullPointerException r92 = new NullPointerException("Null throw statement replaced by Soot");
            throw r92;
        }
        $r52.setAdapter($r32);
        Context $r24 = getContext();
        LinearLayoutManager $r13 = getLayoutManager();
        int $i0 = $r13.m35389v2();
        C1723k $r6 = new C1723k($r24, $i0);
        FragmentActivity $r7 = requireActivity();
        Context $r25 = $r7.getApplicationContext();
        int $i02 = C0214R.C0215drawable.transactions_divider;
        Drawable $r8 = C1335a.m36322f($r25, $i02);
        Log_OC.append($r8);
        $r6.m34703f($r8);
        RecyclerView $r53 = getRecyclerView();
        $r53.m35294h($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GlobalNavigator getGlobalNavigator() {
        GlobalNavigator $r1 = this.globalNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("globalNavigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LinearLayoutManager getLayoutManager() {
        LinearLayoutManager $r1 = this.layoutManager;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("layoutManager");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RecyclerView getRecyclerView() {
        RecyclerView $r1 = this.recyclerView;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("recyclerView");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTicketId() {
        String r1 = this.ticketId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTicketStatus() {
        String r1 = this.ticketStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionAmount() {
        String r1 = this.transactionAmount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionRef() {
        String r1 = this.transactionRef;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionType() {
        String r1 = this.transactionType;
        return r1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r16 == null) goto L7;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.IssueTypeFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void setGlobalNavigator(GlobalNavigator globalNavigator) {
        Log_OC.getArray(globalNavigator, "<set-?>");
        this.globalNavigator = globalNavigator;
    }

    public final void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        Log_OC.getArray(linearLayoutManager, "<set-?>");
        this.layoutManager = linearLayoutManager;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        Log_OC.getArray(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final void setTicketId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.ticketId = str;
    }

    public final void setTicketStatus(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.ticketStatus = str;
    }

    public final void setTransactionAmount(String str) {
        this.transactionAmount = str;
    }

    public final void setTransactionRef(String str) {
        this.transactionRef = str;
    }

    public final void setTransactionType(String str) {
        this.transactionType = str;
    }
}
