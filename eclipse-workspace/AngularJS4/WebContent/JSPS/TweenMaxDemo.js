const alice = document.querySelectorAll('.example__element');

//the elements start from a transform rotate of 0 degrees 
//and end up taking up the values set in CSS
//with half a second delay in between staggers
TweenMax.staggerFrom(alice, 0.5, {
  rotation: 0,
  delay: 1.5,
  ease:  Power4.easeIn
}, 0.5);