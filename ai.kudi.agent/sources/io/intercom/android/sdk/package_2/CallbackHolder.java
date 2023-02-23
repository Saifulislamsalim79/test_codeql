package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.events.ConversationEvent;
import io.intercom.android.sdk.models.events.FormSubmitSuccessEvent;
import io.intercom.android.sdk.models.events.NewConversationEvent;
import io.intercom.android.sdk.models.events.NewTriggerConversationEvent;
import io.intercom.android.sdk.models.events.ReplyEvent;
import io.intercom.android.sdk.models.events.failure.ConversationFailedEvent;
import io.intercom.android.sdk.models.events.failure.FormSubmitFailedEvent;
import io.intercom.android.sdk.models.events.failure.NewConversationFailedEvent;
import io.intercom.android.sdk.models.events.failure.ReplyFailedEvent;
import io.intercom.android.sdk.state.ReplyPart;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
import java.util.List;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CallbackHolder {
    private static final Twig TWIG;
    final Store<State> store;
    final C11129b this$0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Twig $r0 = LumberMill.getLogger();
        TWIG = $r0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallbackHolder(C11129b c11129b, Store store) {
        this.this$0 = c11129b;
        this.store = store;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void conversationFetchSuccess(Conversation conversation, String str) {
        Part $r4;
        List $r3 = conversation.getParts();
        boolean $z0 = $r3.isEmpty();
        if ($z0) {
            $r4 = Part.NULL;
        } else {
            List $r32 = conversation.getParts();
            Object $r5 = $r32.get(0);
            $r4 = (Part) $r5;
        }
        Part $r6 = Part.NULL;
        boolean $z02 = $r6.equals($r4);
        if (!$z02) {
            String $r7 = $r4.getUuid();
            boolean $z03 = $r7.equals(str);
            if ($z03) {
                Store $r8 = this.store;
                Action $r9 = Actions.newConversationSuccess(conversation);
                $r8.dispatch($r9);
                C11129b $r10 = this.this$0;
                String $r2 = $r4.getId();
                NewTriggerConversationEvent $r11 = new NewTriggerConversationEvent(conversation, $r2);
                $r10.post($r11);
                return;
            }
        }
        Store $r82 = this.store;
        Action $r92 = Actions.fetchConversationSuccess(conversation);
        $r82.dispatch($r92);
        C11129b $r102 = this.this$0;
        ConversationEvent.Builder $r12 = new ConversationEvent.Builder(conversation);
        ConversationEvent $r13 = $r12.build();
        $r102.post($r13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback conversationCallback(final String str) {
        return new io.intercom.android.sdk.api.BaseCallback<Conversation.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                CallbackHolder $r3 = CallbackHolder.this;
                C11129b $r4 = $r3.this$0;
                ConversationFailedEvent $r1 = new ConversationFailedEvent();
                $r4.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Conversation.Builder builder) {
                CallbackHolder $r1 = CallbackHolder.this;
                Conversation $r3 = builder.build();
                String $r2 = str;
                $r1.conversationFetchSuccess($r3, $r2);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Conversation.Builder $r2 = (Conversation.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback inboxCallback() {
        return new io.intercom.android.sdk.api.BaseCallback<ConversationsResponse.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                CallbackHolder $r3 = CallbackHolder.this;
                Store $r4 = $r3.store;
                Action $r1 = Actions.fetchInboxFailed();
                $r4.dispatch($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(ConversationsResponse.Builder builder) {
                ConversationsResponse $r2 = builder.build();
                CallbackHolder $r3 = CallbackHolder.this;
                Store $r4 = $r3.store;
                Action $r5 = Actions.baseResponseReceived($r2);
                $r4.dispatch($r5);
                CallbackHolder $r32 = CallbackHolder.this;
                Store $r42 = $r32.store;
                Action $r52 = Actions.fetchInboxSuccess($r2);
                $r42.dispatch($r52);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                ConversationsResponse.Builder $r2 = (ConversationsResponse.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback loggingCallback(final String str) {
        return new Callback<Void>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.8
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                Twig $r3 = CallbackHolder.TWIG;
                StringBuilder $r4 = new StringBuilder();
                String $r5 = str;
                $r4.append($r5);
                $r4.append(" failure");
                String $r52 = $r4.toString();
                $r3.internal($r52);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                Twig $r3 = CallbackHolder.TWIG;
                StringBuilder $r4 = new StringBuilder();
                String $r5 = str;
                $r4.append($r5);
                $r4.append(" success");
                String $r52 = $r4.toString();
                $r3.internal($r52);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback newConversationCallback(final int i, final String str) {
        return new io.intercom.android.sdk.api.BaseCallback<Conversation.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void onError(ErrorObject errorObject) {
                CallbackHolder $r4 = CallbackHolder.this;
                C11129b $r5 = $r4.this$0;
                int $i0 = i;
                String $r2 = str;
                NewConversationFailedEvent $r1 = new NewConversationFailedEvent($i0, $r2);
                $r5.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Conversation.Builder builder) {
                Conversation $r3 = builder.build();
                CallbackHolder $r4 = CallbackHolder.this;
                Store $r5 = $r4.store;
                Action $r6 = Actions.newConversationSuccess($r3);
                $r5.dispatch($r6);
                CallbackHolder $r42 = CallbackHolder.this;
                C11129b $r7 = $r42.this$0;
                String $r1 = str;
                NewConversationEvent $r8 = new NewConversationEvent($r3, $r1);
                $r7.post($r8);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Conversation.Builder $r2 = (Conversation.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback replyCallback(final int i, final boolean z, final String str, final String str2) {
        return new io.intercom.android.sdk.api.BaseCallback<Part.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                CallbackHolder $r4 = CallbackHolder.this;
                C11129b $r5 = $r4.this$0;
                int $i0 = i;
                boolean $z0 = z;
                String $r2 = str;
                ReplyFailedEvent $r1 = new ReplyFailedEvent($i0, $z0, $r2);
                $r5.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Part.Builder builder) {
                Part $r4 = builder.build();
                CallbackHolder $r5 = CallbackHolder.this;
                Store $r6 = $r5.store;
                String $r1 = str2;
                ReplyPart $r7 = new ReplyPart($r4, $r1);
                Action $r8 = Actions.conversationReplySuccess($r7);
                $r6.dispatch($r8);
                CallbackHolder $r52 = CallbackHolder.this;
                C11129b $r9 = $r52.this$0;
                int $i0 = i;
                String $r12 = str;
                String $r2 = str2;
                ReplyEvent $r10 = new ReplyEvent($r4, $i0, $r12, $r2);
                $r9.post($r10);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Part.Builder $r2 = (Part.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback submitFormCallback(final String str, final String str2) {
        return new io.intercom.android.sdk.api.BaseCallback<Conversation.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                CallbackHolder $r5 = CallbackHolder.this;
                C11129b $r6 = $r5.this$0;
                String $r2 = str;
                String $r3 = str2;
                FormSubmitFailedEvent $r1 = new FormSubmitFailedEvent($r2, $r3);
                $r6.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Conversation.Builder builder) {
                Conversation $r3 = builder.build();
                CallbackHolder $r4 = CallbackHolder.this;
                Store $r5 = $r4.store;
                Action $r6 = Actions.fetchConversationSuccess($r3);
                $r5.dispatch($r6);
                CallbackHolder $r42 = CallbackHolder.this;
                C11129b $r7 = $r42.this$0;
                String $r1 = str;
                FormSubmitSuccessEvent $r8 = new FormSubmitSuccessEvent($r3, $r1);
                $r7.post($r8);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Conversation.Builder $r2 = (Conversation.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Callback triggeredInboundBotCallback(final int i, final String str) {
        return new io.intercom.android.sdk.api.BaseCallback<Conversation.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void onError(ErrorObject errorObject) {
                CallbackHolder $r4 = CallbackHolder.this;
                C11129b $r5 = $r4.this$0;
                int $i0 = i;
                String $r2 = str;
                NewConversationFailedEvent $r1 = new NewConversationFailedEvent($i0, $r2);
                $r5.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Conversation.Builder builder) {
                Conversation $r3 = builder.build();
                CallbackHolder $r4 = CallbackHolder.this;
                Store $r5 = $r4.store;
                Action $r6 = Actions.newConversationSuccess($r3);
                $r5.dispatch($r6);
                CallbackHolder $r42 = CallbackHolder.this;
                C11129b $r7 = $r42.this$0;
                String $r1 = str;
                NewTriggerConversationEvent $r8 = new NewTriggerConversationEvent($r3, $r1);
                $r7.post($r8);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Conversation.Builder $r2 = (Conversation.Builder) obj;
                onSuccess($r2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseCallback unreadCallback() {
        return new io.intercom.android.sdk.api.BaseCallback<UsersResponse.Builder>() { // from class: io.intercom.android.sdk.package_2.CallbackHolder.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(UsersResponse.Builder builder) {
                UsersResponse $r2 = builder.build();
                CallbackHolder $r3 = CallbackHolder.this;
                Store $r4 = $r3.store;
                Action $r5 = Actions.baseResponseReceived($r2);
                $r4.dispatch($r5);
                CallbackHolder $r32 = CallbackHolder.this;
                Store $r42 = $r32.store;
                Action $r52 = Actions.unreadConversationsSuccess($r2);
                $r42.dispatch($r52);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                UsersResponse.Builder $r2 = (UsersResponse.Builder) obj;
                onSuccess($r2);
            }
        };
    }
}
