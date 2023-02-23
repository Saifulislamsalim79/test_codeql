package io.intercom.android.sdk.inbox;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.StoreUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.android.sdk.views.EndlessRecyclerScrollListener;
import io.intercom.android.sdk.views.EndlessScrollListener;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import java.util.List;
/* loaded from: classes3.dex */
public class InboxFragment extends Fragment implements View.OnClickListener, ConversationClickListener, EndlessScrollListener, IntercomToolbar.Listener, Store.Subscriber<InboxState> {
    private static final String ARG_IS_TWO_PANE = "is_two_pane";
    private static final int FADE_DURATION_MS = 150;
    private InboxAdapter adapter;
    private Provider<AppConfig> appConfigProvider;
    private FloatingActionButton composerButton;
    private EndlessRecyclerScrollListener endlessRecyclerScrollListener;
    private IntercomErrorView inboxErrorView;
    RecyclerView inboxView;
    private IntercomToolbar intercomToolbar;
    private LinearLayoutManager layoutManager;
    private ProgressBar progressBar;
    private C10486i requestManager;
    private View rootView;
    private Store<State> store;
    private Store.Subscription subscription;
    private WallpaperLoader wallpaperLoader;
    Listener listener = Listener.EMPTY;
    private boolean isTwoPane = false;
    private final Twig twig = LumberMill.getLogger();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.inbox.InboxFragment$5 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C102945 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$state$InboxState$Status;

        static {
            int[] iArr = new int[InboxState.Status.values().length];
            $SwitchMap$io$intercom$android$sdk$state$InboxState$Status = iArr;
            try {
                iArr[InboxState.Status.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$state$InboxState$Status[InboxState.Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$state$InboxState$Status[InboxState.Status.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$state$InboxState$Status[InboxState.Status.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        public static final Listener EMPTY = new Listener() { // from class: io.intercom.android.sdk.inbox.InboxFragment.Listener.1
            @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener, io.intercom.android.sdk.conversation.ConversationFragment.Listener
            public void onBackClicked() {
            }

            @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
            public void onComposerSelected() {
            }

            @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
            public void onConversationSelected(Conversation conversation) {
            }

            @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
            public void onConversationsLoaded(List<Conversation> list, InboxState.Status status) {
            }

            @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener, io.intercom.android.sdk.conversation.ConversationFragment.Listener
            public void onToolbarCloseClicked() {
            }
        };

        void onBackClicked();

        void onComposerSelected();

        void onConversationSelected(Conversation conversation);

        void onConversationsLoaded(List<Conversation> list, InboxState.Status status);

        void onToolbarCloseClicked();
    }

    private void animateHeaderIn() {
        this.intercomToolbar.findViewById(C10110R.C10112id.intercom_toolbar_title).startAnimation(AnimationUtils.loadAnimation(getContext(), C10110R.anim.intercom_profile_slide_in));
    }

    private void displayEmptyView() {
        this.inboxErrorView.setTitle(C10110R.string.intercom_no_conversations);
        this.inboxErrorView.setSubtitle(Phrase.from(getContext(), C10110R.string.intercom_empty_conversations).put("name", this.appConfigProvider.get().getName()).format());
        this.inboxErrorView.setActionButtonVisibility(8);
        this.inboxErrorView.setVisibility(0);
        showComposerButtonIfEnabled();
        this.inboxView.setVisibility(8);
        this.progressBar.setVisibility(8);
    }

    private void displayErrorView() {
        this.inboxErrorView.setTitle(C10110R.string.intercom_inbox_error_state_title);
        this.inboxErrorView.setSubtitle(C10110R.string.intercom_failed_to_load_conversation);
        this.inboxErrorView.setActionButtonText(C10110R.string.intercom_retry);
        this.inboxErrorView.setActionButtonVisibility(0);
        this.inboxErrorView.setVisibility(0);
        this.inboxView.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.composerButton.m26969l();
    }

    private void displayInbox() {
        this.inboxView.setVisibility(0);
        showComposerButtonIfEnabled();
        this.inboxErrorView.setVisibility(8);
        this.progressBar.setVisibility(8);
    }

    private void displayLoadingView() {
        this.inboxErrorView.setVisibility(8);
        this.inboxView.setVisibility(8);
        this.composerButton.m26969l();
        this.progressBar.setVisibility(0);
    }

    private void fadeOutInbox(Animator.AnimatorListener animatorListener) {
        this.intercomToolbar.fadeOutTitle(FADE_DURATION_MS);
        this.inboxView.animate().alpha(0.0f).setDuration(150L).setListener(animatorListener).start();
    }

    private boolean isInboundMessageEnabled() {
        return this.appConfigProvider.get().isInboundMessages();
    }

    public static InboxFragment newInstance(boolean z) {
        InboxFragment inboxFragment = new InboxFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_IS_TWO_PANE, z);
        inboxFragment.setArguments(bundle);
        return inboxFragment;
    }

    private void setColorScheme() {
        AppConfig appConfig = this.appConfigProvider.get();
        int primaryColor = appConfig.getPrimaryColor();
        int secondaryColor = appConfig.getSecondaryColor();
        this.composerButton.setBackgroundTintList(ColorStateList.valueOf(primaryColor));
        ColorUtils.setImageSrcColorWhiteOrDark(this.composerButton, appConfig.primaryColorRenderDarkText());
        this.intercomToolbar.setBackgroundColor(secondaryColor);
    }

    private void setToolbarTitle() {
        this.intercomToolbar.setTitle(getString(C10110R.string.intercom_conversations));
        animateHeaderIn();
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) this.rootView.findViewById(C10110R.C10112id.inbox_recycler_view);
        this.inboxView = recyclerView;
        recyclerView.setLayoutManager(this.layoutManager);
        this.inboxView.m35282l(this.endlessRecyclerScrollListener);
        this.inboxView.setAdapter(this.adapter);
        C1723k c1723k = new C1723k(getContext(), 1);
        c1723k.m34703f(C1335a.m36322f(getContext(), C10110R.C10111drawable.intercom_list_divider));
        this.inboxView.m35294h(c1723k);
    }

    private void setUpToolbar() {
        IntercomToolbar intercomToolbar = (IntercomToolbar) this.rootView.findViewById(C10110R.C10112id.intercom_toolbar);
        this.intercomToolbar = intercomToolbar;
        intercomToolbar.updateToolbarSize();
        this.intercomToolbar.updateToolbarColors(this.appConfigProvider.get());
        this.intercomToolbar.setListener(this);
        this.intercomToolbar.setSubtitleVisibility(8);
        this.intercomToolbar.setLeftNavigationItemVisibility(0);
        setToolbarTitle();
        View findViewById = this.rootView.findViewById(C10110R.C10112id.intercom_inbox_content);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop() + WindowUtils.getStatusBarHeight(getResources()), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
        WallpaperLoader create = WallpaperLoader.create(getContext(), this.appConfigProvider, this.requestManager);
        this.wallpaperLoader = create;
        this.intercomToolbar.loadWallpaper(create);
        if (this.isTwoPane) {
            this.intercomToolbar.setCloseButtonVisibility(8);
        }
    }

    private void showComposerButtonIfEnabled() {
        if (isInboundMessageEnabled()) {
            this.composerButton.m26961t();
        } else {
            this.composerButton.m26969l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.listener = (Listener) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement InboxFragment.Listener");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C10110R.C10112id.compose_action_button) {
            if (this.isTwoPane) {
                this.listener.onComposerSelected();
            } else {
                fadeOutInbox(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.inbox.InboxFragment.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        InboxFragment.this.listener.onComposerSelected();
                    }
                });
            }
        }
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        this.listener.onToolbarCloseClicked();
    }

    @Override // io.intercom.android.sdk.inbox.ConversationClickListener
    public void onConversationClicked(int i) {
        final Conversation conversation = this.store.state().inboxState().conversations().get(i);
        if (this.isTwoPane) {
            this.listener.onConversationSelected(conversation);
        } else {
            fadeOutInbox(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.inbox.InboxFragment.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    InboxFragment.this.listener.onConversationSelected(conversation);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector injector = Injector.get();
        this.requestManager = ComponentCallbacks2C10478c.m13017t(this);
        this.store = injector.getStore();
        this.appConfigProvider = injector.getAppConfigProvider();
        i activity = getActivity();
        this.adapter = new InboxAdapter(LayoutInflater.from(activity), this, this.store, new TimeFormatter(activity, injector.getTimeProvider()), this.appConfigProvider, injector.getUserIdentity(), this.requestManager);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        this.layoutManager = linearLayoutManager;
        this.endlessRecyclerScrollListener = new EndlessRecyclerScrollListener(linearLayoutManager, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isTwoPane = arguments.getBoolean(ARG_IS_TWO_PANE, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.twig.internal("inbox frag", "creating view for fragment");
        View view = this.rootView;
        if (view == null) {
            View inflate = layoutInflater.inflate(C10110R.C10113layout.intercom_fragment_inbox, viewGroup, false);
            this.rootView = inflate;
            this.progressBar = (ProgressBar) inflate.findViewById(C10110R.C10112id.progress_bar);
            setUpRecyclerView();
            FloatingActionButton floatingActionButton = (FloatingActionButton) this.rootView.findViewById(C10110R.C10112id.compose_action_button);
            this.composerButton = floatingActionButton;
            floatingActionButton.setOnClickListener(this);
            IntercomErrorView intercomErrorView = (IntercomErrorView) this.rootView.findViewById(C10110R.C10112id.error_layout_inbox);
            this.inboxErrorView = intercomErrorView;
            intercomErrorView.setActionButtonTextColor(this.appConfigProvider.get().getPrimaryColor());
            this.inboxErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.inbox.InboxFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InboxFragment.this.store.dispatch(Actions.fetchInboxRequest());
                }
            });
            setUpToolbar();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: io.intercom.android.sdk.inbox.InboxFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    InboxFragment.this.store.dispatch(Actions.fetchInboxRequest());
                }
            });
        } else {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.rootView);
            }
            setToolbarTitle();
            this.inboxView.setAdapter(this.adapter);
            this.inboxView.scheduleLayoutAnimation();
        }
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.intercomToolbar.closeWallpaperLoader(this.wallpaperLoader);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.listener = Listener.EMPTY;
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        this.listener.onBackClicked();
    }

    @Override // io.intercom.android.sdk.views.EndlessScrollListener
    public void onLoadMore() {
        InboxState inboxState = this.store.state().inboxState();
        List<Conversation> conversations = inboxState.conversations();
        boolean z = conversations.size() <= 3;
        if (inboxState.status() == InboxState.Status.LOADING || z) {
            return;
        }
        this.store.dispatch(Actions.fetchInboxBeforeDateRequest(conversations.get(conversations.size() - 1).getLastPart().getCreatedAt()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.store.dispatch(Actions.inboxOpened());
        if (!this.isTwoPane) {
            this.inboxView.setAlpha(1.0f);
        }
        setColorScheme();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.subscription = this.store.subscribeToChanges(Selectors.INBOX, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        StoreUtils.safeUnsubscribe(this.subscription);
        super.onStop();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }

    @Override // io.intercom.android.sdk.views.EndlessScrollListener
    public void setOverScrollColour() {
        ViewUtils.setOverScrollColour(this.inboxView, this.appConfigProvider.get().getPrimaryColor());
    }

    @Override // io.intercom.android.sdk.store.Store.Subscriber
    public void onStateChange(InboxState inboxState) {
        this.adapter.setInboxState(inboxState);
        this.adapter.notifyDataSetChanged();
        this.endlessRecyclerScrollListener.setMorePagesAvailable(inboxState.hasMorePages());
        if (!isAdded() || getView() == null) {
            return;
        }
        int i = C102945.$SwitchMap$io$intercom$android$sdk$state$InboxState$Status[inboxState.status().ordinal()];
        if (i == 1) {
            displayLoadingView();
        } else if (i == 2) {
            if (inboxState.conversations().isEmpty()) {
                displayLoadingView();
            } else {
                displayInbox();
            }
        } else if (i != 3) {
            displayErrorView();
        } else {
            if (this.layoutManager.m35406e2() == 0) {
                this.layoutManager.mo32365F1(0);
            }
            if (inboxState.conversations().isEmpty()) {
                displayEmptyView();
            } else {
                displayInbox();
            }
            this.listener.onConversationsLoaded(inboxState.conversations(), inboxState.status());
        }
    }
}
