package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.IntercomLinkPresenter;
import io.intercom.android.sdk.homescreen.HomePresenter;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HomeCardsResponse;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.package_2.ErrorObject;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.utilities.StoreUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.android.sdk.views.HomeToolbar;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomLinkView;
import io.intercom.android.sdk.views.decoration.HomeItemDecoration;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.google.gson.C10916e;
import java.util.ArrayList;
import java.util.List;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class HomeFragment extends Fragment implements IntercomLinkPresenter.IntercomLinkHost, HomePresenter.Listener, Store.Subscriber2<InboxState, TeamPresence> {
    private static final int OFFSCREEN_ITEM_CACHE = 4;
    private final BaseCallback<HomeCardsResponse.Builder> apiCallback;
    private Provider<AppConfig> appConfigProvider;
    private C11129b builder;
    private List<Object> cardList;
    private ViewGroup close;
    private View closeBackground;
    private C10916e gson;
    private HomeCardAdapter homeCardAdapter;
    private HomePresenter homePresenter;
    private IntercomErrorView intercomEmptyView;
    private IntercomErrorView intercomErrorView;
    private View linkContainer;
    private IntercomLinkView linkView;
    private HomeClickListener listener;
    private FeedbackDialog messageList;
    private MetricTracker metricTracker;
    private RecyclerView recyclerView;
    private C10486i requestManager;
    private View rootView;
    private int startLocationY;
    private int statusHeight;
    private Store<State> store;
    private Store.Subscription subscription;
    private TimeProvider timeProvider;
    private HomeToolbar toolbar;
    private View toolbarContent;
    private UserIdentity userIdentity;
    private WallpaperLoader wallpaperLoader;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomeFragment() {
        ArrayList $r1 = new ArrayList();
        this.cardList = $r1;
        this.apiCallback = new BaseCallback<HomeCardsResponse.Builder>() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void onError(ErrorObject errorObject) {
                C102846 c102846;
                HomeFragment $r2 = HomeFragment.this;
                Provider $r3 = $r2.appConfigProvider;
                Object $r4 = $r3.get();
                AppConfig $r5 = (AppConfig) $r4;
                boolean $z0 = $r5.isReceivedFromServer();
                if ($z0) {
                    HomeFragment $r22 = HomeFragment.this;
                    HomePresenter $r6 = $r22.homePresenter;
                    $r6.clearCards();
                    HomeFragment $r23 = HomeFragment.this;
                    HomePresenter $r62 = $r23.homePresenter;
                    HomeFragment $r24 = HomeFragment.this;
                    Store $r7 = $r24.store;
                    Object $r42 = $r7.state();
                    State $r8 = (State) $r42;
                    boolean $z02 = $r8.hasConversations();
                    $r62.updateConversationCard($z02);
                    HomeFragment $r25 = HomeFragment.this;
                    c102846 = this;
                    HomePresenter $r63 = $r25.homePresenter;
                    $r63.addErrorRow();
                } else {
                    HomeFragment $r26 = HomeFragment.this;
                    HomePresenter $r64 = $r26.homePresenter;
                    $r64.clearCards();
                    HomeFragment $r27 = HomeFragment.this;
                    c102846 = this;
                    RelativeLayout $r9 = $r27.intercomErrorView;
                    RelativeLayout r12 = $r9;
                    r12.setVisibility(0);
                }
                C102846 c1028462 = c102846;
                HomeFragment $r28 = HomeFragment.this;
                HomeToolbar $r10 = $r28.toolbar;
                HomeFragment $r29 = HomeFragment.this;
                Provider $r32 = $r29.appConfigProvider;
                Object $r43 = $r32.get();
                AppConfig $r52 = (AppConfig) $r43;
                HomeFragment $r210 = HomeFragment.this;
                C10486i $r11 = $r210.requestManager;
                $r10.updateContent($r52, $r11);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void onSuccess(HomeCardsResponse.Builder builder) {
                HomeFragment $r2 = HomeFragment.this;
                Provider $r3 = $r2.appConfigProvider;
                Object $r4 = $r3.get();
                AppConfig $r5 = (AppConfig) $r4;
                HomeCardsResponse $r6 = builder.build();
                HomeFragment $r22 = HomeFragment.this;
                Store $r7 = $r22.store;
                Action $r8 = Actions.fetchHomeCardsSuccess($r6);
                $r7.dispatch($r8);
                boolean $z0 = $r6.hasConversations();
                if (!$z0) {
                    boolean $z02 = $r5.isInboundMessages();
                    if (!$z02) {
                        List $r9 = $r6.getCards();
                        int $i0 = $r9.size();
                        if ($i0 == 0) {
                            HomeFragment $r23 = HomeFragment.this;
                            RelativeLayout $r10 = $r23.intercomEmptyView;
                            RelativeLayout r14 = $r10;
                            r14.setVisibility(0);
                            return;
                        }
                    }
                }
                HomeFragment $r24 = HomeFragment.this;
                HomePresenter $r11 = $r24.homePresenter;
                boolean $z03 = $r6.hasMoreConversations();
                $r11.updateConversationCard($z03);
                HomeFragment $r25 = HomeFragment.this;
                HomePresenter $r112 = $r25.homePresenter;
                List $r92 = $r6.getCards();
                $r112.updateCards($r92);
                HomeFragment $r26 = HomeFragment.this;
                HomeToolbar $r12 = $r26.toolbar;
                HomeFragment $r27 = HomeFragment.this;
                C10486i $r13 = $r27.requestManager;
                $r12.updateContent($r5, $r13);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                HomeCardsResponse.Builder $r2 = (HomeCardsResponse.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void animateHeaderIn() {
        HomeToolbar $r1 = this.toolbar;
        View $r2 = this.toolbarContent;
        $r1.animateIn($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void applyCloseButtonStyle(TextView textView, AppConfig appConfig) {
        Context $r3 = textView.getContext();
        int $i1 = ColorUtils.primaryOrDarkColor($r3, appConfig);
        FontUtils.setRobotoMediumTypeface(textView);
        Drawable $r4 = textView.getBackground();
        int $i0 = C10110R.C10112id.background;
        BackgroundUtils.setRippleButtonStroke($r3, $r4, $i0, $i1);
        textView.setTextColor($i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void loadHomeScreen() {
        HomePresenter $r2 = this.homePresenter;
        $r2.clearCards();
        HomePresenter $r22 = this.homePresenter;
        $r22.addLoadingCards();
        FeedbackDialog $r3 = this.messageList;
        $r3.fetchHomeCards(this.apiCallback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static HomeFragment newInstance() {
        HomeFragment $r0 = new HomeFragment();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpCardList(Provider provider, Store store, TimeProvider timeProvider, C11129b c11129b, C10916e c10916e, MetricTracker metricTracker, UserIdentity userIdentity) {
        List $r12 = this.cardList;
        HomePresenter $r11 = new HomePresenter(store, provider, $r12, this);
        this.homePresenter = $r11;
        Context $r13 = getContext();
        TimeFormatter $r8 = new TimeFormatter($r13, timeProvider);
        List $r122 = this.cardList;
        C10486i $r9 = this.requestManager;
        HomeClickListener $r10 = this.listener;
        FragmentActivity $r15 = getActivity();
        HomeCardAdapter $r14 = new HomeCardAdapter($r122, store, provider, c11129b, c10916e, metricTracker, $r8, $r9, $r10, userIdentity, $r15);
        this.homeCardAdapter = $r14;
        RecyclerView $r16 = this.recyclerView;
        $r16.setAdapter($r14);
        RecyclerView $r162 = this.recyclerView;
        Context $r132 = getContext();
        List $r123 = this.cardList;
        HomeItemDecoration $r17 = new HomeItemDecoration($r132, $r123);
        $r162.m35294h($r17);
        RecyclerView $r163 = this.recyclerView;
        Context $r133 = getContext();
        LinearLayoutManager $r18 = new LinearLayoutManager($r133);
        $r163.setLayoutManager($r18);
        RecyclerView $r164 = this.recyclerView;
        $r164.setItemViewCacheSize(4);
        RecyclerView $r165 = this.recyclerView;
        $r165.setItemAnimator(null);
        loadHomeScreen();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpCloseButton(AppConfig appConfig) {
        ViewGroup $r2 = this.close;
        int $i0 = C10110R.C10112id.intercom_toolbar_close;
        View $r3 = $r2.findViewById($i0);
        ImageView $r4 = (ImageView) $r3;
        boolean $z0 = appConfig.secondaryColorRenderDarkText();
        ColorUtils.setImageColorWhiteOrBlack($r4, $z0);
        ViewGroup $r22 = this.close;
        $r22.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomeFragment $r32 = HomeFragment.this;
                HomeClickListener $r1 = $r32.listener;
                $r1.onCloseClicked();
            }
        });
        ViewGroup $r23 = this.close;
        int $i02 = $r23.getPaddingLeft();
        ViewGroup $r6 = this.close;
        int $i1 = $r6.getPaddingTop();
        int $i2 = this.statusHeight;
        int $i12 = $i1 + $i2;
        ViewGroup $r62 = this.close;
        int $i22 = $r62.getPaddingRight();
        ViewGroup $r63 = this.close;
        int $i3 = $r63.getPaddingBottom();
        $r23.setPadding($i02, $i12, $i22, $i3);
        ViewGroup $r24 = this.close;
        ViewGroup.LayoutParams $r7 = $r24.getLayoutParams();
        int $i03 = $r7.height;
        int $i13 = this.statusHeight;
        $r7.height = $i03 + $i13;
        ViewGroup $r25 = this.close;
        $r25.setLayoutParams($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpEmptyScreen() {
        RelativeLayout $r1 = this.intercomEmptyView;
        int $i0 = C10110R.C10112id.close_button;
        RelativeLayout r9 = $r1;
        View $r2 = r9.findViewById($i0);
        TextView $r3 = (TextView) $r2;
        $r3.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomeFragment $r22 = HomeFragment.this;
                RelativeLayout $r32 = $r22.intercomEmptyView;
                RelativeLayout r5 = $r32;
                r5.setVisibility(8);
                HomeFragment $r23 = HomeFragment.this;
                HomeClickListener $r4 = $r23.listener;
                $r4.onCloseClicked();
            }
        });
        Provider $r5 = this.appConfigProvider;
        Object $r6 = $r5.get();
        AppConfig $r7 = (AppConfig) $r6;
        applyCloseButtonStyle($r3, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpErrorScreen() {
        IntercomErrorView $r1 = this.intercomErrorView;
        IntercomErrorView r8 = $r1;
        Context $r2 = r8.getContext();
        Provider $r3 = this.appConfigProvider;
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        int $i0 = ColorUtils.primaryOrDarkColor($r2, $r5);
        $r1.setActionButtonTextColor($i0);
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HomeFragment $r32 = HomeFragment.this;
                RelativeLayout $r12 = $r32.intercomErrorView;
                RelativeLayout r4 = $r12;
                r4.setVisibility(8);
                HomeFragment $r33 = HomeFragment.this;
                $r33.loadHomeScreen();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpLinkView(Provider provider, FeedbackDialog feedbackDialog, View view, String str, String str2) {
        int $i0 = C10110R.C10112id.intercom_link;
        View $r6 = view.findViewById($i0);
        IntercomLinkView $r7 = (IntercomLinkView) $r6;
        this.linkView = $r7;
        int $i02 = C10110R.C10112id.intercom_home_link_container;
        View $r3 = view.findViewById($i02);
        this.linkContainer = $r3;
        IntercomLinkView $r72 = this.linkView;
        IntercomLinkPresenter r14 = new IntercomLinkPresenter($r72, provider, feedbackDialog, "", str, str2, true);
        r14.setup(this);
        Object $r9 = provider.get();
        boolean $z0 = ((AppConfig) $r9).shouldShowIntercomLink();
        if (!$z0) {
            View $r32 = this.linkContainer;
            $r32.setVisibility(8);
            return;
        }
        View $r33 = this.linkContainer;
        $r33.setVisibility(0);
        ViewGroup $r11 = this.recyclerView;
        ViewGroup r15 = $r11;
        int $i03 = r15.getPaddingLeft();
        ViewGroup $r12 = this.recyclerView;
        ViewGroup r152 = $r12;
        int $i1 = r152.getPaddingTop();
        ViewGroup $r122 = this.recyclerView;
        ViewGroup r153 = $r122;
        int $i2 = r153.getPaddingRight();
        ViewGroup $r123 = this.recyclerView;
        ViewGroup r154 = $r123;
        int $i3 = r154.getPaddingBottom();
        Resources $r13 = getResources();
        int $i4 = C10110R.dimen.intercom_link_height;
        ViewGroup r155 = $r11;
        r155.setPadding($i03, $i1, $i2, $i3 + $r13.getDimensionPixelSize($i4));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpScrollListener() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 23) {
            RecyclerView $r1 = this.recyclerView;
            $r1.setOnScrollListener(new RecyclerView.AbstractC1644u() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    HomeFragment $r2 = HomeFragment.this;
                    HomePresenter $r3 = $r2.homePresenter;
                    HomeFragment $r22 = HomeFragment.this;
                    int $i02 = $r22.startLocationY;
                    HomeFragment $r23 = HomeFragment.this;
                    View $r4 = $r23.closeBackground;
                    HomeFragment $r24 = HomeFragment.this;
                    View $r5 = $r24.toolbarContent;
                    $r3.renderHeaderScrollChange(recyclerView, $i02, $r4, $r5);
                }
            });
            return;
        }
        ViewGroup $r12 = this.recyclerView;
        ViewGroup r6 = $r12;
        r6.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: io.intercom.android.sdk.homescreen.HomeFragment.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                HomeFragment $r2 = HomeFragment.this;
                HomePresenter $r3 = $r2.homePresenter;
                HomeFragment $r22 = HomeFragment.this;
                RecyclerView $r4 = $r22.recyclerView;
                HomeFragment $r23 = HomeFragment.this;
                int $i02 = $r23.startLocationY;
                HomeFragment $r24 = HomeFragment.this;
                View $r13 = $r24.closeBackground;
                HomeFragment $r25 = HomeFragment.this;
                View $r5 = $r25.toolbarContent;
                $r3.renderHeaderScrollChange($r4, $i02, $r13, $r5);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpToolbar(Provider provider) {
        Object $r2 = provider.get();
        AppConfig $r3 = (AppConfig) $r2;
        int $i0 = $r3.getSecondaryColor();
        ViewGroup $r4 = this.toolbar;
        ViewGroup r10 = $r4;
        r10.setBackgroundColor($i0);
        Context $r5 = getContext();
        C10486i $r6 = ComponentCallbacks2C10478c.m13017t(this);
        WallpaperLoader $r7 = WallpaperLoader.create($r5, provider, $r6);
        this.wallpaperLoader = $r7;
        HomeToolbar $r42 = this.toolbar;
        $r42.loadWallpaper($r7);
        ViewGroup $r43 = this.toolbar;
        ViewGroup r102 = $r43;
        r102.setBackgroundColor($i0);
        HomeToolbar $r44 = this.toolbar;
        Object $r22 = provider.get();
        AppConfig $r32 = (AppConfig) $r22;
        $r44.updateToolbarColors($r32);
        View $r8 = this.toolbarContent;
        int $i02 = $r8.getPaddingLeft();
        View $r9 = this.toolbarContent;
        int $i1 = $r9.getPaddingTop();
        int $i2 = this.statusHeight;
        int $i12 = $i1 + $i2;
        View $r92 = this.toolbarContent;
        int $i22 = $r92.getPaddingRight();
        View $r93 = this.toolbarContent;
        int $i3 = $r93.getPaddingBottom();
        $r8.setPadding($i02, $i12, $i22, $i3);
        HomeToolbar $r45 = this.toolbar;
        Object $r23 = provider.get();
        AppConfig $r33 = (AppConfig) $r23;
        C10486i $r62 = this.requestManager;
        $r45.updateContent($r33, $r62);
        animateHeaderIn();
        updateRecyclerViewPosition();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateRecyclerViewPosition() {
        ViewGroup r6 = this.recyclerView;
        int $i0 = r6.getPaddingTop();
        HomeToolbar $r2 = this.toolbar;
        View $r3 = this.toolbarContent;
        int $i1 = $r2.getContentHeight($r3);
        int $i02 = $i0 + $i1;
        Resources $r4 = getResources();
        int $i12 = C10110R.dimen.intercom_home_screen_overlap;
        this.startLocationY = $i02 - $r4.getDimensionPixelSize($i12);
        ViewGroup $r1 = this.recyclerView;
        ViewGroup r62 = $r1;
        int $i03 = r62.getPaddingLeft();
        int $i13 = this.startLocationY;
        ViewGroup $r5 = this.recyclerView;
        ViewGroup r63 = $r5;
        int $i2 = r63.getPaddingRight();
        ViewGroup $r52 = this.recyclerView;
        ViewGroup r64 = $r52;
        int $i3 = r64.getPaddingBottom();
        ViewGroup r65 = $r1;
        r65.setPadding($i03, $i13, $i2, $i3);
    }

    @Override // io.intercom.android.sdk.conversation.IntercomLinkPresenter.IntercomLinkHost
    public void addBottomPadding(int i) {
    }

    @Override // io.intercom.android.sdk.conversation.IntercomLinkPresenter.IntercomLinkHost
    public boolean isAtBottom() {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.homescreen.HomePresenter.Listener
    public void notifyItemChanged(int i) {
        HomeCardAdapter $r1 = this.homeCardAdapter;
        $r1.notifyItemChanged(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            HomeClickListener $r5 = (HomeClickListener) context;
            this.listener = $r5;
        } catch (ClassCastException e) {
            String $r2 = context + " must implement ConversationCardClickListener";
            ClassCastException $r3 = new ClassCastException($r2);
            throw $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View $r6 = this.rootView;
        if ($r6 == null) {
            Injector $r7 = Injector.get();
            FeedbackDialog $r8 = $r7.getApi();
            this.messageList = $r8;
            Provider $r9 = $r7.getAppConfigProvider();
            this.appConfigProvider = $r9;
            Store $r10 = $r7.getStore();
            this.store = $r10;
            TimeProvider $r11 = $r7.getTimeProvider();
            this.timeProvider = $r11;
            C11129b $r12 = $r7.getBus();
            this.builder = $r12;
            C10916e $r13 = $r7.getGson();
            this.gson = $r13;
            MetricTracker $r4 = $r7.getMetricTracker();
            this.metricTracker = $r4;
            UserIdentity $r5 = $r7.getUserIdentity();
            this.userIdentity = $r5;
            int $i0 = C10110R.C10113layout.intercom_fragment_home;
            this.rootView = layoutInflater.inflate($i0, viewGroup, false);
            Resources $r14 = getResources();
            int $i02 = WindowUtils.getStatusBarHeight($r14);
            this.statusHeight = $i02;
            C10486i $r15 = ComponentCallbacks2C10478c.m13017t(this);
            this.requestManager = $r15;
            View $r62 = this.rootView;
            int $i03 = C10110R.C10112id.intercom_toolbar;
            HomeToolbar $r16 = (HomeToolbar) $r62.findViewById($i03);
            this.toolbar = $r16;
            View $r63 = this.rootView;
            int $i04 = C10110R.C10112id.toolbar_content_container;
            this.toolbarContent = $r63.findViewById($i04);
            View $r64 = this.rootView;
            int $i05 = C10110R.C10112id.card_list;
            RecyclerView $r17 = (RecyclerView) $r64.findViewById($i05);
            this.recyclerView = $r17;
            View $r65 = this.rootView;
            int $i06 = C10110R.C10112id.intercom_home_close_container;
            this.close = (ViewGroup) $r65.findViewById($i06);
            View $r66 = this.rootView;
            int $i07 = C10110R.C10112id.intercom_close_background;
            this.closeBackground = $r66.findViewById($i07);
            View $r67 = this.rootView;
            int $i08 = C10110R.C10112id.error_layout_home_screen;
            IntercomErrorView $r18 = (IntercomErrorView) $r67.findViewById($i08);
            this.intercomErrorView = $r18;
            View $r68 = this.rootView;
            int $i09 = C10110R.C10112id.error_layout_empty_screen;
            IntercomErrorView $r182 = (IntercomErrorView) $r68.findViewById($i09);
            this.intercomEmptyView = $r182;
            setUpErrorScreen();
            setUpEmptyScreen();
            Provider $r92 = this.appConfigProvider;
            setUpToolbar($r92);
            setUpScrollListener();
            Provider $r93 = this.appConfigProvider;
            Object $r19 = $r93.get();
            AppConfig $r20 = (AppConfig) $r19;
            setUpCloseButton($r20);
            Provider $r94 = this.appConfigProvider;
            FeedbackDialog $r82 = this.messageList;
            View $r69 = this.rootView;
            AppIdentity $r21 = $r7.getAppIdentity();
            String $r22 = $r21.appId();
            UserIdentity $r52 = this.userIdentity;
            String $r23 = $r52.getIntercomId();
            setUpLinkView($r94, $r82, $r69, $r22, $r23);
            Provider $r95 = this.appConfigProvider;
            Store $r102 = this.store;
            TimeProvider $r112 = this.timeProvider;
            C11129b $r122 = this.builder;
            C10916e $r132 = this.gson;
            MetricTracker $r42 = this.metricTracker;
            UserIdentity $r53 = this.userIdentity;
            setUpCardList($r95, $r102, $r112, $r122, $r132, $r42, $r53);
        } else {
            ViewParent $r24 = $r6.getParent();
            ViewGroup $r2 = (ViewGroup) $r24;
            if ($r2 != null) {
                $r2.removeView(this.rootView);
            }
            animateHeaderIn();
            ViewGroup $r172 = this.recyclerView;
            $r172.scheduleLayoutAnimation();
        }
        return this.rootView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        HomeToolbar $r1 = this.toolbar;
        WallpaperLoader $r2 = this.wallpaperLoader;
        $r1.closeWallpaperLoader($r2);
        super.onDestroyView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Store $r1 = this.store;
        Action $r2 = Actions.homeOpened();
        $r1.dispatch($r2);
        super.onResume();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Store $r4 = this.store;
        Store.Selector $r1 = Selectors.INBOX;
        Store.Selector $r2 = Selectors.TEAM_PRESENCE;
        Store.Subscription $r3 = $r4.subscribeToChanges($r1, $r2, this);
        this.subscription = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onStateChange  reason: avoid collision after fix types in other method */
    public void onStateChange2(InboxState inboxState, TeamPresence teamPresence) {
        Enum $r4 = inboxState.status();
        Object $r2 = InboxState.Status.SUCCESS;
        Enum r6 = $r4;
        boolean $z0 = r6.equals($r2);
        if ($z0) {
            boolean $z02 = teamPresence.isEmpty();
            if ($z02) {
                return;
            }
            HomePresenter $r5 = this.homePresenter;
            $r5.updateConversationCard();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.store.Store.Subscriber2
    public /* bridge */ /* synthetic */ void onStateChange(InboxState inboxState, TeamPresence teamPresence) {
        InboxState $r3 = inboxState;
        TeamPresence $r4 = teamPresence;
        onStateChange2($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Store.Subscription $r1 = this.subscription;
        StoreUtils.safeUnsubscribe($r1);
        super.onStop();
    }

    public void reload() {
        loadHomeScreen();
    }
}
