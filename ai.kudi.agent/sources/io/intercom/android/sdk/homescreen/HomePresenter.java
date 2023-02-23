package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.homescreen.ConversationCard;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.HomeCard;
import io.intercom.android.sdk.models.HomeErrorRow;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class HomePresenter {
    private static final int CONTENT_OFFSET_DP = 64;
    private static final int CONVERSATION_CARD_POSITION = 0;
    private static final long THREE_DAYS_MILLISECONDS = 259200000;
    private final Provider<AppConfig> appConfigProvider;
    private final List<Object> cardList;
    private boolean hasOlderConversations;
    private final Listener listener;
    private final Store<State> store;
    private final TimeProvider timeProvider;

    /* loaded from: classes.dex */
    public interface Listener {
        void notifyItemChanged(int i);
    }

    HomePresenter(Store store, Provider provider, TimeProvider timeProvider, List list, Listener listener) {
        this.hasOlderConversations = false;
        this.store = store;
        this.appConfigProvider = provider;
        this.timeProvider = timeProvider;
        this.cardList = list;
        this.listener = listener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HomePresenter(io.intercom.android.sdk.store.Store r8, io.intercom.android.sdk.Provider r9, java.util.List r10, io.intercom.android.sdk.homescreen.HomePresenter.Listener r11) {
        /*
            r7 = this;
            io.intercom.android.sdk.commons.utilities.TimeProvider r6 = io.intercom.android.sdk.commons.utilities.TimeProvider.SYSTEM
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r6
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.homescreen.HomePresenter.<init>(io.intercom.android.sdk.store.Store, io.intercom.android.sdk.Provider, java.util.List, io.intercom.android.sdk.homescreen.HomePresenter$Listener):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ConversationCard buildConversationCard(boolean z, boolean z2) {
        this.hasOlderConversations = z;
        List $r1 = getRecentConversations();
        boolean $z0 = !z2;
        boolean $z1 = $r1.isEmpty();
        if ($z0 && $z1) {
            return null;
        }
        boolean $z02 = hasOlderUnreadConversations($r1);
        ConversationCard.Builder $r2 = ConversationCard.builder();
        ConversationCard.Builder $r22 = $r2.recentConversations($r1);
        boolean $z12 = this.hasOlderConversations;
        ConversationCard $r3 = $r22.hasOlderConversations($z12).hasOlderUnreadConversations($z02).build();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private float clamp(float f) {
        float $f0 = Math.max(f, 0.0f);
        return Math.min($f0, 100.0f);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean hasConversationCard() {
        List $r1 = this.cardList;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            return false;
        }
        List $r12 = this.cardList;
        Object $r2 = $r12.get(0);
        boolean $z02 = $r2 instanceof ConversationCard;
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean inboundMessagesEnabled() {
        Provider $r1 = this.appConfigProvider;
        Object $r2 = $r1.get();
        AppConfig $r3 = (AppConfig) $r2;
        boolean $z0 = $r3.isInboundMessages();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private float inverseDecimalPercentage(float f) {
        float $f0 = 1.0f - f;
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addErrorRow() {
        List $r1 = this.cardList;
        HomeErrorRow $r2 = HomeErrorRow.create();
        $r1.add($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addLoadingCards() {
        boolean $z0 = inboundMessagesEnabled();
        if ($z0) {
            List $r1 = this.cardList;
            ConversationCard.Builder $r2 = ConversationCard.builder();
            ConversationCard $r3 = $r2.isLoading(true).build();
            $r1.add($r3);
        }
        Provider $r4 = this.appConfigProvider;
        Object $r5 = $r4.get();
        AppConfig $r6 = (AppConfig) $r5;
        int $i1 = $r6.getHomeScreenCardCount();
        for (int $i0 = 1; $i0 <= $i1; $i0++) {
            List $r12 = this.cardList;
            HomeCard $r7 = HomeCard.create("");
            $r12.add($r7);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void clearCards() {
        List $r1 = this.cardList;
        $r1.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    List getRecentConversations() {
        ArrayList $r1 = new ArrayList();
        TimeProvider $r2 = this.timeProvider;
        long $l0 = $r2.currentTimeMillis();
        long $l02 = $l0 - THREE_DAYS_MILLISECONDS;
        Store $r3 = this.store;
        Object $r4 = $r3.state();
        State $r5 = (State) $r4;
        InboxState $r6 = $r5.inboxState();
        List $r7 = $r6.conversations();
        Iterator $r8 = $r7.iterator();
        while (true) {
            boolean $z0 = $r8.hasNext();
            if (!$z0) {
                break;
            }
            Object $r42 = $r8.next();
            Conversation $r9 = (Conversation) $r42;
            Part $r10 = $r9.getLastPart();
            long $l1 = $r10.getCreatedAt();
            if ($l1 * 1000 < $l02) {
                this.hasOlderConversations = true;
                break;
            }
            $r1.add($r9);
        }
        int $i3 = $r1.size();
        if ($i3 > 3) {
            this.hasOlderConversations = true;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean hasOlderUnreadConversations(java.util.List r14) {
        /*
            r13 = this;
            java.util.HashSet r0 = new java.util.HashSet
            io.intercom.android.sdk.store.Store<io.intercom.android.sdk.state.State> r1 = r13.store
            java.lang.Object r2 = r1.state()
            r4 = r2
            io.intercom.android.sdk.state.State r4 = (io.intercom.android.sdk.state.State) r4
            r3 = r4
            java.util.Set r5 = r3.unreadConversationIds()
            r0.<init>(r5)
            java.util.Iterator r6 = r14.iterator()
        L17:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L37
            java.lang.Object r2 = r6.next()
            r9 = r2
            io.intercom.android.sdk.models.Conversation r9 = (io.intercom.android.sdk.models.Conversation) r9
            r8 = r9
            java.lang.String r10 = r8.getId()
            java.lang.String r11 = r8.getId()
            boolean r7 = r0.contains(r11)
            if (r7 == 0) goto L17
            r0.remove(r10)
            goto L17
        L37:
            boolean r7 = r0.isEmpty()
            r12 = 1
            r7 = r7 ^ r12
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.homescreen.HomePresenter.hasOlderUnreadConversations(java.util.List):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void renderHeaderScrollChange(RecyclerView recyclerView, int i, View view, View view2) {
        RecyclerView r7 = recyclerView;
        View $r4 = r7.getChildAt(0);
        if ($r4 != null) {
            int[] $r5 = new int[2];
            $r4.getLocationInWindow($r5);
            int $i1 = $r5[1];
            float $f0 = $i1;
            float $f1 = clamp(($f0 * 100.0f) / i) / 100.0f;
            float $f02 = inverseDecimalPercentage($f1);
            view.setAlpha($f02);
            view2.setAlpha($f1);
            Context $r6 = view2.getContext();
            int $i0 = ScreenUtils.dpToPx(64.0f, $r6);
            float $f03 = $i0;
            view2.setTranslationY($f03 * (-inverseDecimalPercentage($f1)));
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateCards(List list) {
        boolean $z0 = hasConversationCard();
        for (int $i0 = 0; $i0 < list.size(); $i0++) {
            int $i1 = $z0 ? $i0 + 1 : $i0;
            Object $r2 = list.get($i0);
            HomeCard $r3 = (HomeCard) $r2;
            List $r4 = this.cardList;
            int $i2 = $r4.size();
            if ($i1 < $i2) {
                List $r42 = this.cardList;
                $r42.set($i1, $r3);
            } else {
                List $r43 = this.cardList;
                $r43.add($i1, $r3);
            }
            Listener $r5 = this.listener;
            $r5.notifyItemChanged($i1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateConversationCard() {
        boolean $z0 = this.hasOlderConversations;
        updateConversationCard($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateConversationCard(boolean z) {
        boolean $z1 = inboundMessagesEnabled();
        ConversationCard $r1 = buildConversationCard(z, $z1);
        if ($r1 == null) {
            return;
        }
        boolean $z0 = hasConversationCard();
        if ($z0) {
            List $r2 = this.cardList;
            $r2.set(0, $r1);
        } else {
            List $r22 = this.cardList;
            $r22.add(0, $r1);
        }
        Listener $r3 = this.listener;
        $r3.notifyItemChanged(0);
    }
}
