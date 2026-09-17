const stripe = Stripe('pk_test_51UGY5jQ6Fgfc02Q6DHYEFUaqMupPXkkczQZBtxz0PRbcqGxe2j3oqu43xINUTyG4EMno5fdevT4Vj0C2r4LcHkEN00PAmeczqB');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});