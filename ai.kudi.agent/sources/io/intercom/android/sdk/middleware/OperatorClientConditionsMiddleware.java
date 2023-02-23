package io.intercom.android.sdk.middleware;

import android.os.Handler;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OperatorClientCondition;
import io.intercom.android.sdk.operator.OperatorClientConditionTimer;
import io.intercom.android.sdk.state.ActiveConversationState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.views.ClientConditionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class OperatorClientConditionsMiddleware implements ClientConditionListener, Store.Middleware<State> {
    private static final String USER_INTERACTION_CONDITION = "user_interaction_condition";
    private final Provider<Api> apiProvider;
    final Map<String, List<OperatorClientConditionTimer>> conversationConditions = new HashMap();
    private final Handler handler;

    /* renamed from: io.intercom.android.sdk.middleware.OperatorClientConditionsMiddleware$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C103171 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.COMPOSER_TYPED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_CLEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.COMPOSER_INPUT_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.FETCH_CONVERSATION_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$actions$Action$Type[Action.Type.NEW_CONVERSATION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OperatorClientConditionsMiddleware(Provider<Api> provider, Handler handler) {
        this.apiProvider = provider;
        this.handler = handler;
    }

    private void addClientConditionsForConversation(String str, List<OperatorClientCondition> list, ActiveConversationState activeConversationState) {
        if (list.isEmpty()) {
            return;
        }
        List<OperatorClientConditionTimer> list2 = this.conversationConditions.get(str);
        if (list2 == null) {
            list2 = new ArrayList<>();
            this.conversationConditions.put(str, list2);
        }
        for (OperatorClientCondition operatorClientCondition : list) {
            if (USER_INTERACTION_CONDITION.equals(operatorClientCondition.conditionId())) {
                createOperatorClientConditionTimer(str, activeConversationState, list2, operatorClientCondition);
            }
        }
    }

    private void createOperatorClientConditionTimer(String str, ActiveConversationState activeConversationState, List<OperatorClientConditionTimer> list, OperatorClientCondition operatorClientCondition) {
        OperatorClientConditionTimer operatorClientConditionTimer = new OperatorClientConditionTimer(str, operatorClientCondition.mo13072id(), this.handler, this);
        list.add(operatorClientConditionTimer);
        operatorClientConditionTimer.beginCountdown();
        if (userHasInteractedWithConversation(str, activeConversationState)) {
            operatorClientConditionTimer.interrupt();
        }
    }

    private void interruptCondition(String str) {
        List<OperatorClientConditionTimer> list = this.conversationConditions.get(str);
        if (list != null) {
            for (OperatorClientConditionTimer operatorClientConditionTimer : list) {
                operatorClientConditionTimer.interrupt();
            }
        }
    }

    private boolean userHasInteractedWithConversation(String str, ActiveConversationState activeConversationState) {
        return activeConversationState.getConversationId().equals(str) && (activeConversationState.hasSwitchedInputType() || activeConversationState.hasTextInComposer());
    }

    @Override // io.intercom.android.sdk.views.ClientConditionListener
    public void conditionSatisfied(String str, String str2) {
        Iterator<OperatorClientConditionTimer> it = this.conversationConditions.get(str).iterator();
        while (it.hasNext()) {
            if (it.next().getCondition().equals(str2)) {
                it.remove();
            }
        }
        this.apiProvider.get().satisfyOperatorCondition(str, str2);
    }

    @Override // io.intercom.android.sdk.store.Store.Middleware
    public void dispatch(Store<State> store, Action<?> action, Store.NextDispatcher nextDispatcher) {
        nextDispatcher.dispatch(action);
        int i = C103171.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            interruptCondition(store.state().activeConversationState().getConversationId());
        } else if (i == 4 || i == 5) {
            Conversation conversation = (Conversation) action.value();
            addClientConditionsForConversation(conversation.getId(), conversation.getOperatorClientConditions(), store.state().activeConversationState());
        }
    }
}
