window.onload=function(){
}

function ichikawa(){
	document.getElementsByTagName("iframe")[0].src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3238.932897545606!2d139.906625414888!3d35.727868780183485!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188693b444b883%3A0xd265e9fa433174aa!2z44CSMjcyLTAwMzMg5Y2D6JGJ55yM5biC5bed5biC5biC5bed5Y2X77yR5LiB55uu77yR4oiS77yY!5e0!3m2!1sja!2sjp!4v1552313085881";
	document.getElementById("ichikawa").style.display = "block";
	document.getElementById("motoyawata").style.display = "none";
	document.getElementById("tel").innerHTML="047-314-5748";
	document.getElementById("annai").innerHTML="市川駅南口出って、左側すぐ...";
}

function motoyawata(){
	document.getElementsByTagName("iframe")[0].src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3239.212153592924!2d139.92553541488766!3d35.721000580185006!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x601886d05e1d462b%3A0xcb893573747639c4!2z44CSMjcyLTAwMjEg5Y2D6JGJ55yM5biC5bed5biC5YWr5bmh77yS5LiB55uu77yR77yU4oiS77yX!5e0!3m2!1sja!2sjp!4v1552144387210";
	document.getElementById("ichikawa").style.display = "none";
	document.getElementById("motoyawata").style.display = "block";
	document.getElementById("tel").innerHTML="047-321-6022";
	document.getElementById("annai").innerHTML="本八幡駅北口出って、右側すぐ...";
}