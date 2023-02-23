package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* renamed from: ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment */
/* loaded from: classes.dex */
public abstract class AbstractC0189x8054ad7c {

    /* renamed from: ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment$SendReceiptToTerminalConfirmationBottomSheetSubcomponent */
    /* loaded from: classes.dex */
    public interface SendReceiptToTerminalConfirmationBottomSheetSubcomponent extends b<SendReceiptToTerminalConfirmationBottomSheet> {

        /* renamed from: ai.kudi.agent.core.internal.modules.FragmentInjectionModule_InjectReceiptTerminalConfirmationFragment$SendReceiptToTerminalConfirmationBottomSheetSubcomponent$Factory */
        /* loaded from: classes.dex */
        public interface Factory extends b$a<SendReceiptToTerminalConfirmationBottomSheet> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private AbstractC0189x8054ad7c() {
    }

    abstract b$a bindAndroidInjectorFactory(SendReceiptToTerminalConfirmationBottomSheetSubcomponent.Factory factory);
}
