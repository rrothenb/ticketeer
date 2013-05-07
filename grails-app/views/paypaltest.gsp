<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sample title</title>
  </head>
  <body>
    <h1>Sample line</h1>
<paypal:button 
	itemName="iPod Nano"
	itemNumber="IPD0843403"
	amount="99.00"
    buyerId="1"
	/>
  <form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="9GMXGR7M3U7Z4">
<table>
<tr><td><input type="hidden" name="on0" value="Performance">Performance</td></tr><tr><td><select name="os0">
	<option value="1">Fri, 02/25/11 at 10:15 PM </option>
	<option value="2">Fri, 03/04/11 at 10:15 PM </option>
	<option value="3">Fri, 03/11/11 at 10:15 PM </option>
</select> </td></tr>
</table>
<input type="image" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">
</form>
</body>
</html>
