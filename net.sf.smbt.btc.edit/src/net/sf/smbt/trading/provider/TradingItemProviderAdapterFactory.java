/**
 */
package net.sf.smbt.trading.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.trading.util.TradingAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TradingItemProviderAdapterFactory extends TradingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.Robot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotItemProvider robotItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotAdapter() {
		if (robotItemProvider == null) {
			robotItemProvider = new RobotItemProvider(this);
		}

		return robotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.TradingRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingRuleItemProvider tradingRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.TradingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTradingRuleAdapter() {
		if (tradingRuleItemProvider == null) {
			tradingRuleItemProvider = new TradingRuleItemProvider(this);
		}

		return tradingRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.PriceRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriceRuleItemProvider priceRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.PriceRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriceRuleAdapter() {
		if (priceRuleItemProvider == null) {
			priceRuleItemProvider = new PriceRuleItemProvider(this);
		}

		return priceRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.VolumeRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeRuleItemProvider volumeRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.VolumeRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVolumeRuleAdapter() {
		if (volumeRuleItemProvider == null) {
			volumeRuleItemProvider = new VolumeRuleItemProvider(this);
		}

		return volumeRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.TimeRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRuleItemProvider timeRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.TimeRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeRuleAdapter() {
		if (timeRuleItemProvider == null) {
			timeRuleItemProvider = new TimeRuleItemProvider(this);
		}

		return timeRuleItemProvider;
	}


	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.CompositeRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeRuleItemProvider compositeRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.CompositeRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeRuleAdapter() {
		if (compositeRuleItemProvider == null) {
			compositeRuleItemProvider = new CompositeRuleItemProvider(this);
		}

		return compositeRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.CustomRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomRuleItemProvider customRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.CustomRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomRuleAdapter() {
		if (customRuleItemProvider == null) {
			customRuleItemProvider = new CustomRuleItemProvider(this);
		}

		return customRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.RuleVisitor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleVisitorItemProvider ruleVisitorItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.RuleVisitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleVisitorAdapter() {
		if (ruleVisitorItemProvider == null) {
			ruleVisitorItemProvider = new RuleVisitorItemProvider(this);
		}

		return ruleVisitorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.OrderKindRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderKindRuleItemProvider orderKindRuleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.OrderKindRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderKindRuleAdapter() {
		if (orderKindRuleItemProvider == null) {
			orderKindRuleItemProvider = new OrderKindRuleItemProvider(this);
		}

		return orderKindRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.TradeBotsConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradeBotsConfigItemProvider tradeBotsConfigItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.TradeBotsConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTradeBotsConfigAdapter() {
		if (tradeBotsConfigItemProvider == null) {
			tradeBotsConfigItemProvider = new TradeBotsConfigItemProvider(this);
		}

		return tradeBotsConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.Notification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationItemProvider notificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationAdapter() {
		if (notificationItemProvider == null) {
			notificationItemProvider = new NotificationItemProvider(this);
		}

		return notificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.MailNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MailNotificationItemProvider mailNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.MailNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMailNotificationAdapter() {
		if (mailNotificationItemProvider == null) {
			mailNotificationItemProvider = new MailNotificationItemProvider(this);
		}

		return mailNotificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.SMSNotifcation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMSNotifcationItemProvider smsNotifcationItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.SMSNotifcation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSMSNotifcationAdapter() {
		if (smsNotifcationItemProvider == null) {
			smsNotifcationItemProvider = new SMSNotifcationItemProvider(this);
		}

		return smsNotifcationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.trading.JsonNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonNotificationItemProvider jsonNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.trading.JsonNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonNotificationAdapter() {
		if (jsonNotificationItemProvider == null) {
			jsonNotificationItemProvider = new JsonNotificationItemProvider(this);
		}

		return jsonNotificationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (robotItemProvider != null) robotItemProvider.dispose();
		if (orderItemProvider != null) orderItemProvider.dispose();
		if (tradingRuleItemProvider != null) tradingRuleItemProvider.dispose();
		if (priceRuleItemProvider != null) priceRuleItemProvider.dispose();
		if (volumeRuleItemProvider != null) volumeRuleItemProvider.dispose();
		if (timeRuleItemProvider != null) timeRuleItemProvider.dispose();
		if (compositeRuleItemProvider != null) compositeRuleItemProvider.dispose();
		if (customRuleItemProvider != null) customRuleItemProvider.dispose();
		if (ruleVisitorItemProvider != null) ruleVisitorItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (orderKindRuleItemProvider != null) orderKindRuleItemProvider.dispose();
		if (tradeBotsConfigItemProvider != null) tradeBotsConfigItemProvider.dispose();
		if (notificationItemProvider != null) notificationItemProvider.dispose();
		if (mailNotificationItemProvider != null) mailNotificationItemProvider.dispose();
		if (smsNotifcationItemProvider != null) smsNotifcationItemProvider.dispose();
		if (jsonNotificationItemProvider != null) jsonNotificationItemProvider.dispose();
	}

}
