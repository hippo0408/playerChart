"use strict";

var btn = document.getElementById("download-btn");

btn.addEventListener("click", () => {
	html2canvas(document.querySelector("#canvas-box")).then(canvas => {
		let downloadEle = document.createElement("a");
		downloadEle.href = canvas.toDataURL("image/png");
		downloadEle.download = "canvas.png";
		downloadEle.click();
	});
	
})

var colorBox = document.getElementById("colorBox2");
document.documentElement.style.setProperty('--sample', colorBox.value);