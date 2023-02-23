package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.store.Store;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ComposerSuggestionsReducer implements Store.Reducer<ComposerSuggestions> {
    static final ComposerSuggestions INITIAL_STATE = ComposerSuggestions.create("", Collections.emptyList());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.ComposerSuggestionsReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104131 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.COMPOSER_SUGGESTIONS_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ ComposerSuggestions reduce(Action action, ComposerSuggestions composerSuggestions) {
        return reduce2((Action<?>) action, composerSuggestions);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public ComposerSuggestions reduce2(Action<?> action, ComposerSuggestions composerSuggestions) {
        return C104131.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()] != 1 ? composerSuggestions : (ComposerSuggestions) action.value();
    }
}
