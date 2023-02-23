package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.bills.adapters.BillersAdapter;
import ai.kudi.agent.bills.adapters.Mode;
import ai.kudi.agent.bills.data.AdvertItemTag;
import ai.kudi.agent.bills.data.models.AdvertModel;
import ai.kudi.agent.bills.presenters.HomePresenter;
import ai.kudi.agent.bills.viewHolders.AdvertViewHolderKt;
import ai.kudi.agent.bills.views.HomeView;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.HomeAnalytics;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ImageViewExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.StringSharedPreferenceLiveData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.custom.SpacingItemDecoration;
import ai.kudi.agent.databinding.ViewBillsHomeBinding;
import ai.kudi.agent.databinding.ViewHomeBillsHeaderBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.postRegistrationSetUp.adapter.TodoListAdapter;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.product.repository.RemoteBillerRepositoryImpl;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.carouselView.CarouselView;
import ai.kudi.dip.library.carouselView.EnumC0783f;
import ai.kudi.dip.library.carouselView.InterfaceC0781d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.InterfaceC1584v;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: HomeFragment.kt */
@Metadata(m10422d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u007fB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020\u0003H\u0016J\u0018\u0010H\u001a\u00020F2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020FH\u0002J\u0018\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u0011H\u0016J\u0019\u0010O\u001a\u00020P2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020RH\u0096\u0001J\u0016\u0010S\u001a\u00020F2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002J\b\u0010W\u001a\u00020FH\u0002J\u0010\u0010X\u001a\u00020F2\u0006\u0010Y\u001a\u00020ZH\u0016J$\u0010[\u001a\u00020P2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\b\u0010b\u001a\u00020FH\u0016J\b\u0010c\u001a\u00020FH\u0016J\u001a\u0010d\u001a\u00020F2\u0006\u0010e\u001a\u00020P2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\t\u0010f\u001a\u00020\u0005H\u0096\u0001J\b\u0010g\u001a\u00020FH\u0002J\b\u0010h\u001a\u00020FH\u0002J\u000e\u0010i\u001a\u00020F2\u0006\u0010j\u001a\u00020kJ\b\u0010l\u001a\u00020FH\u0002J\b\u0010m\u001a\u00020FH\u0002J\b\u0010n\u001a\u00020FH\u0002J\b\u0010o\u001a\u00020FH\u0002J\b\u0010p\u001a\u00020FH\u0002J\b\u0010q\u001a\u00020FH\u0002J\u0016\u0010r\u001a\u00020F2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020t0UH\u0016J\u0016\u0010u\u001a\u00020F2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0016J\u0010\u0010v\u001a\u00020F2\u0006\u0010w\u001a\u00020\u0011H\u0016J\u0016\u0010x\u001a\u00020F2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020z0UH\u0016J\u0010\u0010{\u001a\u00020F2\u0006\u0010|\u001a\u00020}H\u0016J\b\u0010~\u001a\u00020FH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0006\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u00109\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u001e\u0010>\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0080\u0001"}, m10421d2 = {"Lai/kudi/agent/bills/ui/HomeFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/bills/views/HomeView;", "Lai/kudi/agent/bills/presenters/HomePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ViewBillsHomeBinding;", "()V", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "binding", "getBinding", "()Lai/kudi/agent/databinding/ViewBillsHomeBinding;", "customerType", "", "homeActivity", "Lai/kudi/agent/home/HomeActivity;", "kshockEligibility", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "listOfAdvert", "Ljava/util/ArrayList;", "Lai/kudi/agent/bills/data/models/AdvertModel;", "Lkotlin/collections/ArrayList;", "listener", "Lai/kudi/agent/bills/ui/HomeFragment$OnFragmentInteractionListener;", "getListener", "()Lai/kudi/agent/bills/ui/HomeFragment$OnFragmentInteractionListener;", "setListener", "(Lai/kudi/agent/bills/ui/HomeFragment$OnFragmentInteractionListener;)V", "remotedb", "Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "getRemotedb", "()Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "setRemotedb", "(Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "textToBold", "getTextToBold", "()Ljava/lang/String;", "textToBold$delegate", "Lkotlin/Lazy;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/bills/presenters/HomePresenter;", "setThisPresenter", "(Lai/kudi/agent/bills/presenters/HomePresenter;)V", "todoListAdapter", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoListAdapter;", "buyAirtime", "", "createPresenter", "enableAdverts", "showSavings", "", "fundWallet", "greetUser", "greeting", "name", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "loadBillers", "billers", "", "Lai/kudi/agent/bills/data/Biller;", "observeWallet", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onViewCreated", "view", "requireBinding", "sendMoney", "setFundWalletButtonTypeFace", "setNotificationCount", "count", "", "setUpAdvertCarousel", "setUpKShockIneligibleAdvert", "setupAppBar", "setupKshockEligibleAdvert", "setupSavingsAdvert", "setupTodo", "showAnnouncements", "announcements", "Lai/kudi/agent/core/domain/room_entities/Announcement;", "showBillers", "showError", MetricTracker.Object.MESSAGE, "showTodoList", "todoList", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "showUserPicture", "user", "Lai/kudi/agent/users/domain/dto/User;", "withdrawCash", "OnFragmentInteractionListener", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment */
/* loaded from: classes.dex */
public final class HomeFragment extends MvpFragment<HomeView, HomePresenter> implements HomeView, BaseViewBinder<ViewBillsHomeBinding> {
    private final /* synthetic */ BaseViewBinderImpl<ViewBillsHomeBinding> $$delegate_0;
    public Analytics analytics;
    private String customerType;
    private HomeActivity homeActivity;
    private KshockEligibility kshockEligibility;
    public GridLayoutManager layoutManager;
    private ArrayList<AdvertModel> listOfAdvert;
    public OnFragmentInteractionListener listener;
    public RemoteBillerRepositoryImpl remotedb;
    public SharedPreferences sharedPreferences;
    public SmartLookAnalytics smartLookAnalytics;
    private final InterfaceC11824h textToBold$delegate;
    public HomePresenter thisPresenter;
    private TodoListAdapter todoListAdapter;

    /* compiled from: HomeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/bills/ui/HomeFragment$OnFragmentInteractionListener;", "", "goToIssueResolution", "", "onNotificationClicked", "onShowActivityToolbar", "show", "", "onToggleDrawerLayout", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.ui.HomeFragment$OnFragmentInteractionListener */
    /* loaded from: classes.dex */
    public interface OnFragmentInteractionListener {
        void goToIssueResolution();

        void onNotificationClicked();

        void onShowActivityToolbar(boolean z);

        void onToggleDrawerLayout();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomeFragment() {
        InterfaceC11824h $r1;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        HomeFragment$textToBold$2 $r3 = new HomeFragment$textToBold$2(this);
        $r1 = C13218k.m5625b($r3);
        this.textToBold$delegate = $r1;
        ArrayList $r4 = new ArrayList();
        this.listOfAdvert = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void buyAirtime() {
        HomeFragment r6 = this;
        FragmentActivity $r2 = r6.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        HomeFragment$buyAirtime$1 $r1 = HomeFragment$buyAirtime$1.INSTANCE;
        ContextExtKt.launchActivity$default((Context) $r2, false, ProductActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
        InterfaceC9413d $r3 = this.presenter;
        HomeAnalytics.Events $r5 = HomeAnalytics.Events.HOME_SCREEN_AIRTIME_DATA_CLICKED;
        ((HomePresenter) $r3).logEvent($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fundWallet() {
        HomeFragment r7 = this;
        Intent r6 = new Intent(r7.getContext(), WalletTopUpActivity.class);
        r6.putExtra(WalletTopUpActivity.EXTRA_MODE, WalletTopUpActivity.MODE_WALLET_TOPUP);
        HomeFragment r72 = this;
        Context $r2 = r72.getContext();
        if ($r2 != null) {
            $r2.startActivity(r6);
        }
        InterfaceC9413d $r3 = this.presenter;
        HomePresenter $r4 = (HomePresenter) $r3;
        HomeAnalytics.Events $r5 = HomeAnalytics.Events.HOME_SCREEN_FUND_WALLET_CLICKED;
        $r4.logEvent($r5);
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getTextToBold() {
        InterfaceC11824h $r2 = this.textToBold$delegate;
        Object $r1 = $r2.getValue();
        String $r3 = (String) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadBillers(List list) {
        HomeFragment r19 = this;
        if (r19.getContext() == null) {
            return;
        }
        ViewBillsHomeBinding $r3 = requireBinding();
        ViewHomeBillsHeaderBinding $r4 = $r3.viewBillsHeader;
        TextView $r5 = $r4.viewAll;
        TextView r20 = $r5;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39091loadBillers$lambda17$lambda16($r2, view);
            }
        });
        Mode $r8 = Mode.HOME;
        HomeFragment$loadBillers$1$billersAdapter$1 r15 = new HomeFragment$loadBillers$1$billersAdapter$1(this);
        BillersAdapter r16 = new BillersAdapter(list, $r8, r15);
        RecyclerView $r10 = $r3.billersRecyclerView;
        HomeFragment r192 = this;
        Context $r2 = r192.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        SpacingItemDecoration r17 = new SpacingItemDecoration($r2, C0001R.dimen.pay_bills_list_item_margin);
        $r10.m35294h(r17);
        HomeFragment r193 = this;
        Context $r22 = r193.getContext();
        HomeFragment r194 = this;
        Context $r13 = r194.requireContext();
        Log_OC.loadImage($r13, "requireContext()");
        float $f0 = ViewExtKt.getScreenWidth($r13);
        byte $b0 = $f0 < 350.0f ? (byte) 3 : (byte) 4;
        GridLayoutManager r18 = new GridLayoutManager($r22, $b0);
        setLayoutManager(r18);
        RecyclerView $r102 = $r3.billersRecyclerView;
        GridLayoutManager $r12 = getLayoutManager();
        $r102.setLayoutManager($r12);
        RecyclerView $r103 = $r3.billersRecyclerView;
        $r103.setAdapter(r16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadBillers$lambda-17$lambda-16  reason: not valid java name */
    public static final void m39091loadBillers$lambda17$lambda16(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        HomeFragment r5 = homeFragment;
        FragmentActivity $r1 = r5.getActivity();
        Intent r4 = new Intent($r1, ProductActivity.class);
        HomeFragment r52 = homeFragment;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeWallet() {
        SharedPreferences $r2 = getSharedPreferences();
        StringSharedPreferenceLiveData r5 = new StringSharedPreferenceLiveData($r2, ConstantsKt.EXTRA_WALLET_BALANCE);
        HomeFragment r7 = this;
        PreferenceActivity $r3 = r7.getViewLifecycleOwner();
        r5.observe($r3, new InterfaceC1584v() { // from class: ai.kudi.agent.bills.ui.SearchActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onCreateContextMenu(Object obj) {
                HomeFragment $r1 = HomeFragment.this;
                String $r32 = (String) obj;
                HomeFragment.m39092observeWallet$lambda10($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeWallet$lambda-10  reason: not valid java name */
    public static final void m39092observeWallet$lambda10(HomeFragment homeFragment, String str) {
        Log_OC.getArray(homeFragment, "this$0");
        ViewBillsHomeBinding $r2 = homeFragment.requireBinding();
        TextView $r3 = $r2.textWalletBalance;
        Log_OC.loadImage(str, "it");
        String $r1 = StringExtKt.formatDecimalAmount(str);
        $r3.setText($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7$lambda-0  reason: not valid java name */
    public static final void m39093onViewCreated$lambda7$lambda0(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        homeFragment.fundWallet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7$lambda-1  reason: not valid java name */
    public static final void m39094onViewCreated$lambda7$lambda1(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        homeFragment.sendMoney();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7$lambda-2  reason: not valid java name */
    public static final void m39095onViewCreated$lambda7$lambda2(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        homeFragment.buyAirtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-7$lambda-3  reason: not valid java name */
    public static final void m39096onViewCreated$lambda7$lambda3(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        homeFragment.withdrawCash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-4  reason: not valid java name */
    public static final void m39097onViewCreated$lambda7$lambda4(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        OnFragmentInteractionListener $r0 = homeFragment.getListener();
        $r0.goToIssueResolution();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-5  reason: not valid java name */
    public static final void m39098onViewCreated$lambda7$lambda5(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        OnFragmentInteractionListener $r0 = homeFragment.getListener();
        $r0.onToggleDrawerLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39099onViewCreated$lambda7$lambda6(HomeFragment homeFragment, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        OnFragmentInteractionListener $r0 = homeFragment.getListener();
        $r0.onToggleDrawerLayout();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void sendMoney() {
        HomeFragment r7 = this;
        Intent r6 = new Intent(r7.getContext(), TransferActivity.class);
        HomeFragment r72 = this;
        Context $r2 = r72.getContext();
        if ($r2 != null) {
            $r2.startActivity(r6);
        }
        InterfaceC9413d $r3 = this.presenter;
        HomePresenter $r4 = (HomePresenter) $r3;
        HomeAnalytics.Events $r5 = HomeAnalytics.Events.HOME_SCREEN_TRANSFER_CLICKED;
        $r4.logEvent($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setFundWalletButtonTypeFace() {
        ViewBillsHomeBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.buttonFundWallet;
        TextView $r3 = $r2.getTextView();
        Typeface $r4 = $r3.getTypeface();
        $r3.setTypeface($r4, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpAdvertCarousel() {
        ViewBillsHomeBinding $r1 = requireBinding();
        CarouselView $r2 = $r1.kshockCarouselView;
        $r2.setAutoPlay(true);
        $r2.setAutoPlayDelay(3000);
        $r2.setScaleOnScroll(true);
        ArrayList $r3 = this.listOfAdvert;
        int $i0 = $r3.size();
        $r2.setSize($i0);
        $r2.setResource(C0001R.C0004layout.layout_carousel_dashboard);
        EnumC0783f $r4 = EnumC0783f.START;
        $r2.setCarouselOffset($r4);
        $r2.setCarouselListener(new InterfaceC0781d() { // from class: ai.kudi.agent.bills.ui.HomeFragment$setUpAdvertCarousel$1$1$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.carouselView.InterfaceC0781d
            public void onBindView(View view, int i) {
                Fragment $r22 = HomeFragment.this;
                Fragment r5 = $r22;
                Context $r32 = r5.requireContext();
                Log_OC.loadImage($r32, "requireContext()");
                HomeFragment $r23 = HomeFragment.this;
                ArrayList $r42 = $r23.listOfAdvert;
                AdvertViewHolderKt.bindViewHolder($r32, view, $r42, i);
            }
        });
        $r2.m37997k();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpKShockIneligibleAdvert() {
        ArrayList $r1 = this.listOfAdvert;
        HomeFragment r9 = this;
        String $r4 = r9.getString(C0001R.string.not_eligible_home_page_text);
        Log_OC.loadImage($r4, "getString(R.string.not_eligible_home_page_text)");
        HomeFragment r92 = this;
        String $r5 = r92.getString(C0001R.string.k_shock_ineligible_homepage_description_text);
        Log_OC.loadImage($r5, "getString(R.string.k_shock_ineligible_homepage_description_text)");
        HomeFragment r93 = this;
        String $r6 = r93.getString(C0001R.string.tap_to_learn_how_to_be_eligible);
        Log_OC.loadImage($r6, "getString(R.string.tap_to_learn_how_to_be_eligible)");
        String $r7 = getTextToBold();
        AdvertItemTag $r2 = AdvertItemTag.KSHOCK_INELIGIBLE;
        AdvertModel r8 = new AdvertModel(C0001R.C0002drawable.ic_k_shock_home, $r4, $r5, $r6, C0001R.color.colorAccent, $r7, $r2, null, 128, null);
        $r1.add(r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupAppBar() {
        final ViewBillsHomeBinding $r3 = requireBinding();
        ImageButton $r1 = $r3.notificationMenuItem;
        ImageButton r5 = $r1;
        r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment $r2 = HomeFragment.this;
                ViewBillsHomeBinding $r32 = $r3;
                HomeFragment.m39100setupAppBar$lambda12$lambda11($r2, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupAppBar$lambda-12$lambda-11  reason: not valid java name */
    public static final void m39100setupAppBar$lambda12$lambda11(HomeFragment homeFragment, ViewBillsHomeBinding viewBillsHomeBinding, View view) {
        Log_OC.getArray(homeFragment, "this$0");
        Log_OC.getArray(viewBillsHomeBinding, "$this_apply");
        OnFragmentInteractionListener $r0 = homeFragment.getListener();
        $r0.onNotificationClicked();
        TextView $r4 = viewBillsHomeBinding.notificationCountText;
        Log_OC.loadImage($r4, "notificationCountText");
        ViewExtKt.hide$default($r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupKshockEligibleAdvert() {
        Double $r6;
        ArrayList $r1 = this.listOfAdvert;
        Object[] $r3 = new Object[1];
        KshockEligibility $r4 = this.kshockEligibility;
        String $r5 = ($r4 == null || ($r6 = $r4.getMaxLoanAmount()) == null) ? null : StringExtKt.formatAmount($r6);
        if ($r5 == null) {
            String $r7 = getString(C0001R.string.default_k_shock_amount);
            $r5 = $r7;
            Log_OC.loadImage($r7, "getString(R.string.default_k_shock_amount)");
        }
        $r3[0] = $r5;
        String $r52 = getString(C0001R.string.get_loan_home_screen_text, $r3);
        Log_OC.loadImage($r52, "getString(\n                    R.string.get_loan_home_screen_text,\n                    kshockEligibility?.maxLoanAmount?.formatAmount()\n                        ?: getString(R.string.default_k_shock_amount)\n                )");
        String $r72 = getString(C0001R.string.get_loan_description_text);
        Log_OC.loadImage($r72, "getString(R.string.get_loan_description_text)");
        String $r8 = getString(C0001R.string.tap_to_get_started);
        Log_OC.loadImage($r8, "getString(R.string.tap_to_get_started)");
        String $r9 = getTextToBold();
        AdvertItemTag $r10 = AdvertItemTag.KSHOCK_ELIGIBLE;
        KshockEligibility $r42 = this.kshockEligibility;
        Double $r62 = $r42 == null ? null : $r42.getMaxLoanAmount();
        AdvertModel r11 = new AdvertModel(C0001R.C0002drawable.ic_k_shock_home, $r52, $r72, $r8, C0001R.color.colorAccent, $r9, $r10, $r62);
        $r1.add(r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupSavingsAdvert() {
        ArrayList $r1 = this.listOfAdvert;
        HomeFragment r8 = this;
        String $r4 = r8.getString(C0001R.string.save_with_nomba_today);
        Log_OC.loadImage($r4, "getString(R.string.save_with_nomba_today)");
        HomeFragment r82 = this;
        String $r5 = r82.getString(C0001R.string.start_saving_with_nomba);
        Log_OC.loadImage($r5, "getString(R.string.start_saving_with_nomba)");
        HomeFragment r83 = this;
        String $r6 = r83.getString(C0001R.string.tap_to_get_started);
        Log_OC.loadImage($r6, "getString(R.string.tap_to_get_started)");
        AdvertItemTag $r2 = AdvertItemTag.SAVINGS;
        AdvertModel r7 = new AdvertModel(C0001R.C0002drawable.ic_purse, $r4, $r5, $r6, C0001R.color.colorAccent, null, $r2, null, 128, null);
        $r1.add(r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupTodo() {
        HomeFragment$setupTodo$1 r10 = new HomeFragment$setupTodo$1(this);
        TodoListAdapter r11 = new TodoListAdapter(r10);
        this.todoListAdapter = r11;
        final ViewBillsHomeBinding $r3 = requireBinding();
        RecyclerView $r4 = $r3.todoList;
        HomeFragment r14 = this;
        Context $r6 = r14.requireContext();
        LinearLayoutManager r12 = new LinearLayoutManager($r6);
        $r4.setLayoutManager(r12);
        RecyclerView $r42 = $r3.todoList;
        $r42.setHasFixedSize(true);
        RecyclerView $r43 = $r3.todoList;
        TodoListAdapter $r1 = this.todoListAdapter;
        if ($r1 == null) {
            Log_OC.LogError("todoListAdapter");
            NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
            throw r9;
        }
        $r43.setAdapter($r1);
        TextView $r7 = $r3.accountSetupTitle;
        TextView r15 = $r7;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewBillsHomeBinding $r2 = ViewBillsHomeBinding.this;
                HomeFragment.m39101setupTodo$lambda15$lambda14($r2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupTodo$lambda-15$lambda-14  reason: not valid java name */
    public static final void m39101setupTodo$lambda15$lambda14(ViewBillsHomeBinding viewBillsHomeBinding, View view) {
        Log_OC.getArray(viewBillsHomeBinding, "$this_apply");
        RecyclerView $r2 = viewBillsHomeBinding.todoList;
        Log_OC.loadImage($r2, "todoList");
        boolean $z0 = ViewExtKt.isVisible($r2);
        if ($z0) {
            RecyclerView $r22 = viewBillsHomeBinding.todoList;
            Log_OC.loadImage($r22, "todoList");
            ViewExtKt.hide$default($r22, false, 1, null);
            View $r1 = viewBillsHomeBinding.accountSetupDivider;
            Log_OC.loadImage($r1, "accountSetupDivider");
            ViewExtKt.hide$default($r1, false, 1, null);
            AppCompatTextView $r3 = viewBillsHomeBinding.accountSetupTitle;
            Log_OC.loadImage($r3, "accountSetupTitle");
            ViewExtKt.setDrawableResource$default($r3, 0, 0, C0001R.C0002drawable.bill_list_item_arrow_down, 0, 11, null);
            return;
        }
        View $r23 = viewBillsHomeBinding.todoList;
        Log_OC.loadImage($r23, "todoList");
        ViewExtKt.show($r23);
        View $r12 = viewBillsHomeBinding.accountSetupDivider;
        Log_OC.loadImage($r12, "accountSetupDivider");
        ViewExtKt.show($r12);
        TextView $r32 = viewBillsHomeBinding.accountSetupTitle;
        Log_OC.loadImage($r32, "accountSetupTitle");
        TextView r4 = $r32;
        ViewExtKt.setDrawableResource$default(r4, 0, 0, C0001R.C0002drawable.bill_item_arrow_up, 0, 11, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void withdrawCash() {
        HomeActivity $r3 = this.homeActivity;
        if ($r3 == null) {
            Log_OC.LogError("homeActivity");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        } else if ($r3 == null) {
            Log_OC.LogError("homeActivity");
            NullPointerException r72 = new NullPointerException("Null throw statement replaced by Soot");
            throw r72;
        } else {
            Activity r9 = (Activity) $r3;
            String $r2 = r9.getString(C0001R.string.text_withdraw_cash);
            Log_OC.loadImage($r2, "homeActivity.getString(R.string.text_withdraw_cash)");
            $r3.setToolbarTitle($r2);
            HomeActivity $r32 = this.homeActivity;
            if ($r32 == null) {
                Log_OC.LogError("homeActivity");
                NullPointerException r73 = new NullPointerException("Null throw statement replaced by Soot");
                throw r73;
            }
            $r32.toggleBottomNav(false);
            HomeActivity $r33 = this.homeActivity;
            if ($r33 == null) {
                Log_OC.LogError("homeActivity");
                NullPointerException r74 = new NullPointerException("Null throw statement replaced by Soot");
                throw r74;
            }
            $r33.toggleOverflowMenu(true);
            WithdrawCashFragment r8 = new WithdrawCashFragment();
            HomeActivity $r34 = this.homeActivity;
            if ($r34 == null) {
                Log_OC.LogError("homeActivity");
                NullPointerException r75 = new NullPointerException("Null throw statement replaced by Soot");
                throw r75;
            }
            AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r34, r8, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            InterfaceC9413d $r4 = this.presenter;
            HomePresenter $r5 = (HomePresenter) $r4;
            HomeAnalytics.Events $r6 = HomeAnalytics.Events.HOME_SCREEN_WITHDRAW_MONEY_CLICKED;
            $r5.logEvent($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public HomePresenter createPresenter() {
        HomePresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.views.HomeView
    public void enableAdverts(KshockEligibility kshockEligibility, boolean z) {
        Log_OC.getArray(kshockEligibility, "kshockEligibility");
        this.kshockEligibility = kshockEligibility;
        boolean $z0 = kshockEligibility.getEligible();
        if ($z0) {
            setupKshockEligibleAdvert();
        } else {
            setUpKShockIneligibleAdvert();
        }
        setupSavingsAdvert();
        setUpAdvertCarousel();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewBillsHomeBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        ViewBillsHomeBinding $r3 = (ViewBillsHomeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        ViewBillsHomeBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GridLayoutManager getLayoutManager() {
        GridLayoutManager $r1 = this.layoutManager;
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
    public final OnFragmentInteractionListener getListener() {
        OnFragmentInteractionListener $r1 = this.listener;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("listener");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RemoteBillerRepositoryImpl getRemotedb() {
        RemoteBillerRepositoryImpl $r1 = this.remotedb;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remotedb");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HomePresenter getThisPresenter() {
        HomePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.views.HomeView
    public void greetUser(String str, String str2) {
        Log_OC.getArray(str, "greeting");
        Log_OC.getArray(str2, "name");
        ViewBillsHomeBinding $r3 = requireBinding();
        TextView $r4 = $r3.textGreeting;
        Object[] $r5 = {str, str2};
        HomeFragment r7 = this;
        String $r1 = r7.getString(C0001R.string.home_greeting_name, $r5);
        Log_OC.loadImage($r1, "getString(R.string.home_greeting_name, greeting, name)");
        Spanned $r6 = StringExtKt.getGetSpannedText($r1);
        $r4.setText($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(ViewBillsHomeBinding viewBillsHomeBinding, Fragment fragment) {
        Log_OC.getArray(viewBillsHomeBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(viewBillsHomeBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        ViewBillsHomeBinding $r4 = (ViewBillsHomeBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        HomeFragment r9 = this;
        C7429a.m18752b(r9);
        HomeFragment r92 = this;
        super.onAttach(context);
        boolean $z0 = context instanceof HomeActivity;
        if ($z0) {
            HomeActivity $r4 = (HomeActivity) context;
            this.homeActivity = $r4;
        }
        boolean $z02 = context instanceof OnFragmentInteractionListener;
        if ($z02) {
            OnFragmentInteractionListener $r5 = (OnFragmentInteractionListener) context;
            setListener($r5);
            return;
        }
        String $r2 = context + " must implement OnFragmentInteractionListener";
        RuntimeException r8 = new RuntimeException($r2);
        throw r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        ViewBillsHomeBinding $r4 = ViewBillsHomeBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        HomeFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OnFragmentInteractionListener $r1 = getListener();
        $r1.onShowActivityToolbar(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HomePresenter $r1 = getThisPresenter();
        $r1.fetchTodos();
        HomePresenter $r12 = getThisPresenter();
        $r12.fetchUser();
        HomePresenter $r13 = getThisPresenter();
        $r13.fetchAnnouncements();
        HomeActivity $r2 = this.homeActivity;
        if ($r2 == null) {
            Log_OC.LogError("homeActivity");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        $r2.toggleBottomNav(true);
        HomeActivity $r22 = this.homeActivity;
        if ($r22 == null) {
            Log_OC.LogError("homeActivity");
            NullPointerException r42 = new NullPointerException("Null throw statement replaced by Soot");
            throw r42;
        }
        $r22.toggleOverflowMenu(false);
        OnFragmentInteractionListener $r3 = getListener();
        $r3.onShowActivityToolbar(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List $r25;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        SharedPreferences $r3 = getSharedPreferences();
        String $r5 = $r3.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        this.customerType = $r5 != null ? $r5 : "AGENT";
        HomePresenter $r6 = getThisPresenter();
        $r6.fetchFrequentlyUsedBillers();
        setFundWalletButtonTypeFace();
        HomePresenter $r62 = getThisPresenter();
        String $r4 = this.customerType;
        if ($r4 == null) {
            Log_OC.LogError("customerType");
            NullPointerException $r15 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r15;
        }
        $r62.fetchMiniKshockDetails($r4);
        ViewBillsHomeBinding $r7 = requireBinding();
        ViewGroup $r8 = $r7.buttonFundWallet;
        ViewGroup r35 = $r8;
        r35.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39093onViewCreated$lambda7$lambda0($r2, view2);
            }
        });
        LinearLayout $r10 = $r7.cardSendMoney;
        $r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39094onViewCreated$lambda7$lambda1($r2, view2);
            }
        });
        LinearLayout $r102 = $r7.cardBuyAirtime;
        $r102.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39095onViewCreated$lambda7$lambda2($r2, view2);
            }
        });
        String $r42 = this.customerType;
        if ($r42 == null) {
            Log_OC.LogError("customerType");
            NullPointerException $r152 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r152;
        }
        boolean $z0 = Log_OC.append($r42, "USER");
        if ($z0) {
            LinearLayout $r103 = $r7.cardWithdrawCash;
            Log_OC.loadImage($r103, "cardWithdrawCash");
            ViewExtKt.hide$default($r103, false, 1, null);
            LinearLayout $r104 = $r7.cardSendMoney;
            ViewGroup.LayoutParams $r13 = $r104.getLayoutParams();
            if ($r13 == null) {
                NullPointerException r30 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                throw r30;
            }
            LinearLayout.LayoutParams $r14 = (LinearLayout.LayoutParams) $r13;
            $r14.weight = 1.5f;
            LinearLayout $r105 = $r7.cardSendMoney;
            $r105.setLayoutParams($r14);
            LinearLayout $r106 = $r7.cardBuyAirtime;
            $r106.setLayoutParams($r14);
        }
        LinearLayout $r107 = $r7.cardWithdrawCash;
        $r107.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39096onViewCreated$lambda7$lambda3($r2, view2);
            }
        });
        TextView $r17 = $r7.needHelpButton;
        $r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39097onViewCreated$lambda7$lambda4($r2, view2);
            }
        });
        setupAppBar();
        setupTodo();
        ImageButton $r19 = $r7.navDrawerToggle;
        ImageButton r36 = $r19;
        r36.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39098onViewCreated$lambda7$lambda5($r2, view2);
            }
        });
        ImageView $r21 = $r7.userMenuPicture;
        ImageView r37 = $r21;
        r37.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment $r2 = HomeFragment.this;
                HomeFragment.m39099onViewCreated$lambda7$lambda6($r2, view2);
            }
        });
        observeWallet();
        TextView $r24 = $r7.textWalletBalance;
        Log_OC.loadImage($r24, "textWalletBalance");
        TextView $r242 = $r7.textGreeting;
        Log_OC.loadImage($r242, "textGreeting");
        View[] $r23 = {$r24, $r242};
        $r25 = C13726r.m3888h($r23);
        SmartLookAnalytics $r26 = getSmartLookAnalytics();
        $r26.setupBlacklistedViews($r25);
        SmartLookAnalytics $r262 = getSmartLookAnalytics();
        $r262.logBill();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewBillsHomeBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        ViewBillsHomeBinding $r3 = (ViewBillsHomeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        ViewBillsHomeBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setLayoutManager(GridLayoutManager gridLayoutManager) {
        Log_OC.getArray(gridLayoutManager, "<set-?>");
        this.layoutManager = gridLayoutManager;
    }

    public final void setListener(OnFragmentInteractionListener onFragmentInteractionListener) {
        Log_OC.getArray(onFragmentInteractionListener, "<set-?>");
        this.listener = onFragmentInteractionListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setNotificationCount(int i) {
        ViewBillsHomeBinding $r1 = requireBinding();
        if (i <= 0) {
            TextView $r2 = $r1.notificationCountText;
            Log_OC.loadImage($r2, "notificationCountText");
            ViewExtKt.hide$default($r2, false, 1, null);
            return;
        }
        TextView $r22 = $r1.notificationCountText;
        Log_OC.loadImage($r22, "notificationCountText");
        ViewExtKt.show($r22);
        TextView $r23 = $r1.notificationCountText;
        String $r3 = String.valueOf(i);
        $r23.setText($r3);
    }

    public final void setRemotedb(RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        Log_OC.getArray(remoteBillerRepositoryImpl, "<set-?>");
        this.remotedb = remoteBillerRepositoryImpl;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setThisPresenter(HomePresenter homePresenter) {
        Log_OC.getArray(homePresenter, "<set-?>");
        this.thisPresenter = homePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0067 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    @Override // ai.kudi.agent.bills.views.HomeView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showAnnouncements(java.util.List r30) {
        /*
            r29 = this;
            java.lang.String r4 = "announcements"
            r0 = r30
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r4)
            r0 = r29
            android.content.SharedPreferences r5 = r0.getSharedPreferences()
            java.lang.String r6 = "AGENT"
            java.lang.String r4 = "customer_type"
            java.lang.String r8 = "AGENT"
            java.lang.String r7 = r5.getString(r4, r8)
            if (r7 != 0) goto L1a
            goto L1b
        L1a:
            r6 = r7
        L1b:
            r0 = r30
            boolean r9 = r0.isEmpty()
            r10 = 1
            r9 = r9 ^ r10
            if (r9 == 0) goto Lb9
            r0 = r29
            ai.kudi.agent.databinding.ViewBillsHomeBinding r11 = r0.requireBinding()
            ai.kudi.dip.library.SafeViewPager r12 = r11.rvNotifications
            java.lang.String r4 = "requireBinding().rvNotifications"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r4)
            r14 = r12
            android.view.View r14 = (android.view.View) r14
            r13 = r14
            ai.kudi.agent.core.util.ViewExtKt.show(r13)
            r0 = r29
            ai.kudi.agent.databinding.ViewBillsHomeBinding r11 = r0.requireBinding()
            ai.kudi.dip.library.SafeViewPager r12 = r11.rvNotifications
            r16 = r29
            androidx.fragment.app.Fragment r16 = (androidx.fragment.app.Fragment) r16
            r15 = r16
            android.content.Context r17 = r15.requireContext()
            java.lang.String r4 = "requireContext()"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r4)
            java.util.ArrayList r18 = new java.util.ArrayList
            r19 = r18
            r0 = r18
            r0.<init>()
            r0 = r30
            java.util.Iterator r20 = r0.iterator()
        L61:
            r0 = r20
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L9d
            r0 = r20
            java.lang.Object r21 = r0.next()
            r23 = r21
            ai.kudi.agent.core.domain.room_entities.Announcement r23 = (ai.kudi.agent.core.domain.room_entities.Announcement) r23
            r22 = r23
            r0 = r22
            java.lang.String r7 = r0.getCustomerType()
            boolean r9 = kotlin.p483e0.p485d.Log_OC.append(r7, r6)
            if (r9 != 0) goto L92
            r0 = r22
            java.lang.String r7 = r0.getCustomerType()
            java.lang.String r4 = "ALL"
            boolean r9 = kotlin.p483e0.p485d.Log_OC.append(r7, r4)
            if (r9 == 0) goto L90
            goto L92
        L90:
            r9 = 0
            goto L93
        L92:
            r9 = 1
        L93:
            if (r9 == 0) goto L61
            r0 = r19
            r1 = r21
            r0.add(r1)
            goto L61
        L9d:
            ai.kudi.agent.bills.ui.HomeFragment$showAnnouncements$2 r24 = new ai.kudi.agent.bills.ui.HomeFragment$showAnnouncements$2
            r0 = r24
            r1 = r29
            r0.<init>(r1)
            ai.kudi.agent.bills.adapters.AnnouncementsPagerAdapter r25 = new ai.kudi.agent.bills.adapters.AnnouncementsPagerAdapter
            r0 = r25
            r1 = r17
            r2 = r19
            r3 = r24
            r0.<init>(r1, r2, r3)
            r0 = r25
            r12.setAdapter(r0)
            return
        Lb9:
            r0 = r29
            ai.kudi.agent.databinding.ViewBillsHomeBinding r11 = r0.requireBinding()
            ai.kudi.dip.library.SafeViewPager r12 = r11.rvNotifications
            java.lang.String r4 = "requireBinding().rvNotifications"
            kotlin.p483e0.p485d.Log_OC.loadImage(r12, r4)
            r26 = r12
            android.view.View r26 = (android.view.View) r26
            r13 = r26
            r10 = 0
            r27 = 1
            r28 = 0
            r0 = r27
            r1 = r28
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r13, r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.p002ui.HomeFragment.showAnnouncements(java.util.List):void");
    }

    @Override // ai.kudi.agent.bills.views.HomeView
    public void showBillers(List list) {
        Log_OC.getArray(list, "billers");
        loadBillers(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.views.HomeView
    public void showError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        HomeFragment r3 = this;
        Context $r2 = r3.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.views.HomeView
    public void showTodoList(List list) {
        float $f0;
        Log_OC.getArray(list, "todoList");
        SharedPreferences $r2 = getSharedPreferences();
        String $r3 = $r2.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        boolean $z0 = Log_OC.append($r3, "USER");
        if ($z0) {
            return;
        }
        ViewBillsHomeBinding $r4 = requireBinding();
        boolean $z02 = list.isEmpty();
        if ($z02) {
            View $r5 = $r4.cardAccountSetupContainer;
            Log_OC.loadImage($r5, "cardAccountSetupContainer");
            View r12 = $r5;
            ViewExtKt.hide$default(r12, false, 1, null);
            return;
        }
        int $i0 = list.size();
        if ($i0 == 1) {
            HomeFragment r13 = this;
            Resources $r6 = r13.getResources();
            $f0 = $r6.getDimension(C0001R.dimen.bills_home_todo_list_small_height);
        } else {
            HomeFragment r132 = this;
            Resources $r62 = r132.getResources();
            $f0 = $r62.getDimension(C0001R.dimen.bills_home_todo_list_height);
        }
        int $i02 = (int) $f0;
        LinearLayout.LayoutParams r11 = new LinearLayout.LayoutParams(-1, $i02);
        HomeFragment r133 = this;
        Resources $r63 = r133.getResources();
        float $f02 = $r63.getDimension(C0001R.dimen.dimen_15dp);
        int $i03 = (int) $f02;
        ((ViewGroup.MarginLayoutParams) r11).topMargin = $i03;
        ViewGroup $r8 = $r4.todoList;
        ViewGroup r14 = $r8;
        r14.setLayoutParams(r11);
        View $r52 = $r4.cardAccountSetupContainer;
        Log_OC.loadImage($r52, "cardAccountSetupContainer");
        View r122 = $r52;
        ViewExtKt.show(r122);
        TodoListAdapter $r9 = this.todoListAdapter;
        if ($r9 != null) {
            $r9.setData(list);
            return;
        }
        Log_OC.LogError("todoListAdapter");
        NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
        throw r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.views.HomeView
    public void showUserPicture(User user) {
        Log_OC.getArray(user, "user");
        ViewBillsHomeBinding $r2 = requireBinding();
        ImageView $r3 = $r2.userMenuPicture;
        Log_OC.loadImage($r3, "requireBinding().userMenuPicture");
        HomeFragment r10 = this;
        Context $r4 = r10.requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        ImageUtil.Companion $r5 = ImageUtil.Companion;
        String $r6 = user.profilePictureId;
        String $r62 = $r5.getRemotePathImageId($r6);
        HomeFragment r102 = this;
        Context $r7 = r102.requireContext();
        Log_OC.loadImage($r7, "requireContext()");
        Drawable $r8 = ContextExtKt.getKudiDrawable($r7, C0001R.C0002drawable.ic_default_user_image);
        Log_OC.append($r8);
        HomeFragment r103 = this;
        Context $r72 = r103.requireContext();
        Log_OC.loadImage($r72, "requireContext()");
        Drawable $r9 = ContextExtKt.getKudiDrawable($r72, C0001R.C0002drawable.ic_default_user_image);
        Log_OC.append($r9);
        ImageView r11 = $r3;
        ImageViewExtKt.load(r11, $r4, $r62, $r8, $r9);
    }
}
