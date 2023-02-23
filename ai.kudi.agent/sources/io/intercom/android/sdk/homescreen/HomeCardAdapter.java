package io.intercom.android.sdk.homescreen;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HomeCard;
import io.intercom.android.sdk.models.HomeErrorRow;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.google.gson.C10916e;
import java.util.List;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class HomeCardAdapter extends RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> {
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final List<Object> cardList;
    private final HomeClickListener clickListener;
    private final C11129b feature;
    private final C10916e gson;
    private final MetricTracker metricTracker;
    private final C10486i requestManager;
    private final Store<State> store;
    private final TimeFormatter timeFormatter;
    private final UserIdentity userIdentity;

    public HomeCardAdapter(List list, Store store, Provider provider, C11129b c11129b, C10916e c10916e, MetricTracker metricTracker, TimeFormatter timeFormatter, C10486i c10486i, HomeClickListener homeClickListener, UserIdentity userIdentity, Activity activity) {
        this.cardList = list;
        this.store = store;
        this.appConfigProvider = provider;
        this.feature = c11129b;
        this.gson = c10916e;
        this.metricTracker = metricTracker;
        this.timeFormatter = timeFormatter;
        this.requestManager = c10486i;
        this.userIdentity = userIdentity;
        this.clickListener = homeClickListener;
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.cardList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        List $r1 = this.cardList;
        Object $r2 = $r1.get(i);
        boolean $z0 = $r2 instanceof ConversationCard;
        if (!$z0) {
            boolean $z02 = $r2 instanceof HomeErrorRow;
            return $z02 ? 4 : 2;
        }
        List $r12 = this.cardList;
        ConversationCard $r3 = (ConversationCard) $r12.get(i);
        boolean $z03 = $r3.isLoading();
        if ($z03) {
            return 3;
        }
        List $r13 = $r3.recentConversations();
        boolean $z04 = $r13.isEmpty();
        return !$z04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        Store $r2 = this.store;
        Store.Selector $r3 = Selectors.TEAM_PRESENCE;
        TeamPresence $r5 = (TeamPresence) $r2.select($r3);
        List $r6 = this.cardList;
        Object $r4 = $r6.get(i);
        boolean $z0 = $r4 instanceof ConversationCard;
        if (!$z0) {
            boolean $z02 = $r4 instanceof HomeCard;
            if ($z02) {
                HomeCard $r14 = (HomeCard) $r4;
                MessengerAppCardViewHolder $r15 = (MessengerAppCardViewHolder) abstractC1620e0;
                String $r16 = $r14.fallbackUrl();
                $r15.bindCard($r16);
                return;
            }
            return;
        }
        ConversationCard $r7 = (ConversationCard) $r4;
        boolean $z03 = abstractC1620e0 instanceof NewConversationCardViewHolder;
        if ($z03) {
            NewConversationCardViewHolder $r8 = (NewConversationCardViewHolder) abstractC1620e0;
            C10486i $r9 = this.requestManager;
            $r8.bindTeamPresence($r5, $r9, $r7);
            return;
        }
        boolean $z04 = abstractC1620e0 instanceof RecentConversationCardViewHolder;
        if ($z04) {
            RecentConversationCardViewHolder $r10 = (RecentConversationCardViewHolder) abstractC1620e0;
            UserIdentity $r11 = this.userIdentity;
            Provider $r12 = this.appConfigProvider;
            AppConfig $r13 = (AppConfig) $r12.get();
            $r10.bindConversationCard($r7, $r11, $r13, $r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int $i0) {
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        if ($i0 == 0) {
            View $r5 = $r4.inflate(C10110R.C10113layout.intercom_new_conversation_card, viewGroup, false);
            Provider $r7 = this.appConfigProvider;
            HomeClickListener $r8 = this.clickListener;
            NewConversationCardViewHolder $r6 = new NewConversationCardViewHolder($r5, $r7, $r8);
            return $r6;
        } else if ($i0 == 1) {
            View $r52 = $r4.inflate(C10110R.C10113layout.intercom_recent_conversation_card, viewGroup, false);
            TimeFormatter $r10 = this.timeFormatter;
            Provider $r72 = this.appConfigProvider;
            C10486i $r11 = this.requestManager;
            HomeClickListener $r82 = this.clickListener;
            RecentConversationCardViewHolder $r9 = new RecentConversationCardViewHolder($r52, $r10, $r72, $r11, $r82);
            return $r9;
        } else if ($i0 == 2) {
            View $r53 = $r4.inflate(C10110R.C10113layout.intercom_messenger_app_card, viewGroup, false);
            C11129b $r13 = this.feature;
            Provider $r73 = this.appConfigProvider;
            C10916e $r14 = this.gson;
            MetricTracker $r15 = this.metricTracker;
            Activity $r1 = this.activity;
            MessengerAppCardViewHolder $r12 = new MessengerAppCardViewHolder($r53, $r13, $r73, $r14, $r15, $r1);
            return $r12;
        } else if ($i0 != 4) {
            View $r54 = $r4.inflate(C10110R.C10113layout.intercom_row_card_loading, viewGroup, false);
            Provider $r74 = this.appConfigProvider;
            ConversationCardLoadingViewHolder $r17 = new ConversationCardLoadingViewHolder($r54, $r74);
            return $r17;
        } else {
            View $r55 = $r4.inflate(C10110R.C10113layout.intercom_home_error_row, viewGroup, false);
            Provider $r75 = this.appConfigProvider;
            HomeClickListener $r83 = this.clickListener;
            ErrorViewHolder $r16 = new ErrorViewHolder($r55, $r75, $r83);
            return $r16;
        }
    }
}
