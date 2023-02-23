package io.intercom.android.sdk.inbox;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.InboxRowLayout;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.Locale;
/* loaded from: classes3.dex */
class InboxAdapter extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> {
    static final int CONVERSATION = 0;
    static final int LOADING = 1;
    private final Provider<AppConfig> appConfigProvider;
    private final ConversationClickListener conversationClickListener;
    private InboxState inboxState;
    private final LayoutInflater inflater;
    private final C10486i requestManager;
    private final Store<State> store;
    private final TimeFormatter timeFormatter;
    private UserIdentity userIdentity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InboxAdapter(LayoutInflater layoutInflater, ConversationClickListener conversationClickListener, Store<State> store, TimeFormatter timeFormatter, Provider<AppConfig> provider, UserIdentity userIdentity, C10486i c10486i) {
        this.inflater = layoutInflater;
        this.conversationClickListener = conversationClickListener;
        this.store = store;
        this.timeFormatter = timeFormatter;
        this.appConfigProvider = provider;
        this.userIdentity = userIdentity;
        this.requestManager = c10486i;
        setHasStableIds(true);
    }

    private int conversationCount() {
        return this.inboxState.conversations().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return conversationCount() + (this.inboxState.status() == InboxState.Status.LOADING ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public long getItemId(int i) {
        if (i == conversationCount()) {
            return -1L;
        }
        String id = this.inboxState.conversations().get(i).getId();
        if (!TextUtils.isEmpty(id) && TextUtils.isDigitsOnly(id)) {
            return Long.valueOf(id).longValue();
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        return i == conversationCount() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        if (abstractC1620e0 instanceof InboxRowViewHolder) {
            ((InboxRowViewHolder) abstractC1620e0).bindData(this.inboxState.conversations().get(i), this.userIdentity, this.appConfigProvider.get(), (TeamPresence) this.store.select(Selectors.TEAM_PRESENCE));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            InboxRowLayout inboxRowLayout = new InboxRowLayout(viewGroup.getContext());
            inboxRowLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new InboxRowViewHolder(inboxRowLayout, this.conversationClickListener, this.timeFormatter, this.requestManager);
        } else if (i == 1) {
            return new LoadingViewHolder(this.inflater.inflate(C10110R.C10113layout.intercom_row_loading, viewGroup, false));
        } else {
            throw new RuntimeException(String.format(Locale.getDefault(), "View type %d not supported", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInboxState(InboxState inboxState) {
        this.inboxState = inboxState;
    }
}
